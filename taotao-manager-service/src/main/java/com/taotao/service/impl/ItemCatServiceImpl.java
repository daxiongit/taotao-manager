package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.utils.TreeNode;
import com.taotao.mapper.ItemCatMapper;
import com.taotao.pojo.ItemCat;
import com.taotao.pojo.ItemCatExample;
import com.taotao.pojo.ItemCatExample.Criteria;
import com.taotao.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService {

	@Autowired
	private ItemCatMapper itemCatMapper;

	@Override
	public List<TreeNode> getItemCatList(long parentId) {
		ItemCatExample example = new ItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
		List<ItemCat> itemCatList = itemCatMapper.selectByExample(example);
		for (ItemCat itemCat : itemCatList) {
			TreeNode treeNode = new TreeNode(itemCat.getId(), itemCat.getName(),
					itemCat.getIsParent() ? "closed" : "open");
			treeNodeList.add(treeNode);
		}
		return treeNodeList;
	}

}
