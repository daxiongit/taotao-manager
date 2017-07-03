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
import com.taotao.mapper.ItemDescMapper;
import com.taotao.mapper.ItemMapper;
import com.taotao.mapper.ItemParamItemMapper;
import com.taotao.pojo.Item;
import com.taotao.pojo.ItemDesc;
import com.taotao.pojo.ItemExample;
import com.taotao.pojo.ItemExample.Criteria;
import com.taotao.pojo.ItemParamItem;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;

	@Autowired
	private ItemDescMapper itemDescMapper;

	@Autowired
	private ItemParamItemMapper itemParamItemMapper;

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
		EasyUIResult result = new EasyUIResult(total, itemList);
		return result;
	}

	/*
	 * 添加商品信息
	 * */
	@Override
	public TaotaoResult saveItem(Item item, String desc, String itemParams) throws Exception {
		Date date = new Date();
		// 获得商品id
		long id = IDUtils.genItemId();
		// 添加商品信息
		item.setId(id);
		// 商品状态，1-正常，2-下架，3-删除
		item.setStatus((byte) 1);
		item.setCreated(date);
		item.setUpdated(date);
		itemMapper.insert(item);
		
		// 添加商品描述
		TaotaoResult result = insertItemDesc(id,desc);
		if(result.getStatus() != 200){
			throw new Exception();
		}
		// 添加商品规格信息
		result = insertItemParamItem(id, itemParams);
		if(result.getStatus() != 200){
			throw new Exception();
		}
		
		return TaotaoResult.ok();

	}

	/*
	 * 添加商品详情信息
	 */
	private TaotaoResult insertItemDesc(Long itemid, String desc) {
		// 创建TbItemDesc对象
		ItemDesc itemDesc = new ItemDesc();
		// 获得一个商品id
		itemDesc.setItemId(itemid);
		itemDesc.setItemDesc(desc);
		itemDesc.setCreated(new Date());
		itemDesc.setUpdated(new Date());
		// 插入数据
		itemDescMapper.insert(itemDesc);
		return TaotaoResult.ok();
	}

	/*
	 * 添加商品规格信息
	 */
	private TaotaoResult insertItemParamItem(Long itemid, String itemParams) {

		ItemParamItem itemParamItem = new ItemParamItem();
		itemParamItem.setItemId(itemid);
		itemParamItem.setParamData(itemParams);
		itemParamItem.setCreated(new Date());
		itemParamItem.setUpdated(new Date());
		itemParamItemMapper.insert(itemParamItem);
		return TaotaoResult.ok();
	}

}
