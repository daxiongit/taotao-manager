package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.utils.EasyUIResult;
import com.taotao.mapper.ItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemExample;
import com.taotao.pojo.ItemExample.Criteria;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;

	@Override
	public Item getItemById(long id) {
		ItemExample example = new ItemExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		List<Item> itemList = itemMapper.selectByExample(example);
		if (itemList != null && itemList.size() > 0) {
			Item item = itemList.get(0);
			return item;
		}
		return null;
	}

	@Override
	public EasyUIResult getItemList(Integer page, Integer rows) {
		ItemExample example = new ItemExample();
		PageHelper.startPage(page, rows);
		List<Item> itemList = itemMapper.selectByExample(example);
		PageInfo<Item> pageInfo = new PageInfo<>(itemList);
		long total = pageInfo.getTotal();
		EasyUIResult result = new EasyUIResult(total,itemList);
		return result;
	}

}
