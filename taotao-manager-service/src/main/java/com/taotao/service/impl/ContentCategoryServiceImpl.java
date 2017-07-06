package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.utils.TaotaoResult;
import com.taotao.common.utils.TreeNode;
import com.taotao.mapper.ContentCategoryMapper;
import com.taotao.pojo.ContentCategory;
import com.taotao.pojo.ContentCategoryExample;
import com.taotao.pojo.ContentCategoryExample.Criteria;
import com.taotao.service.ContentCategoryService;

@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {

	@Autowired
	private ContentCategoryMapper contentCategoryMapper;
	
    // 获取内容分类列表，展示为树形结构
	@Override
	public List<TreeNode> getContentCatList(long parentId) {
		
		ContentCategoryExample example = new ContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<ContentCategory> list = contentCategoryMapper.selectByExample(example);
		
		List<TreeNode> result = new ArrayList<>();
		for(ContentCategory concat : list){
			TreeNode node = new TreeNode();
			node.setId(concat.getId());
			node.setText(concat.getName());
			node.setState(concat.getIsParent() ? "closed" : "open");
			result.add(node);
		}
		
		return result;
	}

	// 添加内容分类
	@Override
	public TaotaoResult insertContentCategory(long parentId, String name) {
		ContentCategory contentCategory = new ContentCategory();
		// id 自增长,不需要添加，但是需要返回刚刚插入的id,需要修改mapper文件 SELECT LAST_INSERT_ID()
		contentCategory.setIsParent(false);
		contentCategory.setName(name);
		contentCategory.setParentId(parentId);
		contentCategory.setSortOrder(1);
		contentCategory.setStatus(1);
		contentCategory.setCreated(new Date());
		contentCategory.setUpdated(new Date());
		// 插入数据
		contentCategoryMapper.insert(contentCategory);
		
		// 判断添加分类的父节点的 isParent 是否为 true
		ContentCategory parent = contentCategoryMapper.selectByPrimaryKey(parentId);
		System.out.println("父节点：" + parentId);
		if(!parent.getIsParent()){
			parent.setIsParent(true);
			contentCategoryMapper.updateByPrimaryKey(parent);
		}
		
		return TaotaoResult.ok(contentCategory);
	}

	// 删除分类
	@Override
	public TaotaoResult deleteContentCategory(long parentId, long id) {
		// 删除分类
		contentCategoryMapper.deleteByPrimaryKey(id);
		// 判断删除分类的父级下是否还有子级，如果没有子节点，需要将该父节点的 isParent 改为 false;
		ContentCategoryExample example = new ContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<ContentCategory> list = contentCategoryMapper.selectByExample(example);
		if(!(list != null && list.size() > 0)){  // 没有子节点
			ContentCategory parent = contentCategoryMapper.selectByPrimaryKey(parentId);
			parent.setIsParent(false);
			contentCategoryMapper.updateByPrimaryKey(parent);
		}
		return TaotaoResult.ok();
	}

	// 更新分类节点
	@Override
	public TaotaoResult updateContentCategory(long id, String name) {
		ContentCategory contentCategory = contentCategoryMapper.selectByPrimaryKey(id);
		// 获取父节点主键
		long parentId = contentCategory.getParentId();
		contentCategory.setName(name);
		contentCategoryMapper.updateByPrimaryKey(contentCategory);
		// 判断删除节点的父节点下还有没有子节点，如果没有子节点，需要修改父节点的 isParent 为 false
		ContentCategoryExample example = new ContentCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<ContentCategory> list = contentCategoryMapper.selectByExample(example);
		if(!(list != null && list.size() > 0)){   // 没有子节点
			ContentCategory parent = contentCategoryMapper.selectByPrimaryKey(parentId);
			parent.setIsParent(false);
			contentCategoryMapper.updateByPrimaryKey(parent);
		}
		return TaotaoResult.ok();
	}

}
