package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taotao.service.ItemParamItemService;

@Controller
public class ItemParamItemController {

	@Autowired
	private ItemParamItemService itemParamItemService;
	
	/**
	 * 查询商品规格参数，用于显示到用户页面，此处直接返回html数据。
	 * */
	@RequestMapping("/item/itemParam/{itemId}")
	public String showItemParamItem(@PathVariable Long itemId,Model model){
		String itemParamItem = itemParamItemService.getItemParamItemByItemId(itemId);
		model.addAttribute("itemParam",itemParamItem);
		return "item";
	}
	
}
