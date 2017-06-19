package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.utils.EasyUIResult;
import com.taotao.pojo.Item;
import com.taotao.service.ItemService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public Item getItemById(@PathVariable Long itemId){
		Item item = itemService.getItemById(itemId);
		return item;
	}
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/item-list")
	public String itemList(){
		return "item-list";
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIResult getItemList(@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "30")Integer rows){
		EasyUIResult result = itemService.getItemList(page, rows);
		return result;
	}
	
}
