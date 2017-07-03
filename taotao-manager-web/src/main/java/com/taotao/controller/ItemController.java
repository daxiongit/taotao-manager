package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.utils.EasyUIResult;
import com.taotao.common.utils.TaotaoResult;
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
	
	/*显示商品列表页面
	@RequestMapping("/item-list")
	public String itemList(){
		return "item-list";
	}
	
	显示新增商品页面
	@RequestMapping("/item-add")
	public String itemAdd(){
		return "item-add";
	}*/
	
	// 显示其他页面
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	
	@RequestMapping("/item/list")
	@ResponseBody
	public EasyUIResult getItemList(@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "30")Integer rows){
		EasyUIResult result = itemService.getItemList(page, rows);
		return result;
	}
	
	@RequestMapping(value = "/item/save", method = RequestMethod.POST)
	@ResponseBody
	public TaotaoResult saveItem(Item item,String desc,String itemParams) throws Exception{
		TaotaoResult result = itemService.saveItem(item, desc, itemParams);
		return result;
	}
	
}
