package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.utils.TreeNode;
import com.taotao.service.ItemCatService;

@Controller
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;
	
	@RequestMapping("/item/cat/list")
	@ResponseBody()
	public List<TreeNode> getItemCatList(@RequestParam(value = "id",defaultValue = "0") long parentId){
		List<TreeNode> result = itemCatService.getItemCatList(parentId);
		return result;
	}
	
}
