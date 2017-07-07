package com.taotao.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.utils.EasyUIResult;
import com.taotao.common.utils.IDUtils;
import com.taotao.common.utils.TaotaoResult;
import com.taotao.mapper.ContentMapper;
import com.taotao.pojo.Content;
import com.taotao.pojo.ContentExample;
import com.taotao.pojo.ContentExample.Criteria;
import com.taotao.service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentMapper contentMapper;
	
	@Override
	public EasyUIResult getContentList(long categoryId, Integer page, Integer rows) {
		ContentExample example = new ContentExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(categoryId);
		// 分页信息
		PageHelper.startPage(page,rows);
		List<Content> list = contentMapper.selectByExample(example);
		// 多态，获取分页信息
		PageInfo<Content> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		EasyUIResult result = new EasyUIResult(total,list);
		return result;
	}

	@Override
	public TaotaoResult insertContent(Content content) {
		// id 为自动增长，不需要设置
		content.setCreated(new Date());
		content.setUpdated(new Date());
		
		// 图片上传
		
		contentMapper.insert(content);
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult editContent(Content content) {
		// 编辑
		content.setUpdated(new Date());
		// 上传图片
		
		contentMapper.updateByPrimaryKey(content);
		
		return TaotaoResult.ok();
	}

	@Override
	public TaotaoResult deleteContent(String ids) {
		if(ids.contains(",")){
			String[] singleId = ids.split(",");
			for(int i = 0;i < singleId.length;i++){
				contentMapper.deleteByPrimaryKey(Long.parseLong(singleId[i]));
			}
		} else {
			contentMapper.deleteByPrimaryKey(Long.parseLong(ids));
		}
		return TaotaoResult.ok();
	}

	
}
