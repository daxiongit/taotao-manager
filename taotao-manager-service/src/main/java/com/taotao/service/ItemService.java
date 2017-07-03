package com.taotao.service;

import com.taotao.common.utils.EasyUIResult;
import com.taotao.common.utils.TaotaoResult;
import com.taotao.pojo.Item;

public interface ItemService {

	Item getItemById(long id);
	
	EasyUIResult getItemList(Integer page,Integer row);
	
	TaotaoResult saveItem(Item item,String desc,String itemParams) throws Exception ;
	
}
