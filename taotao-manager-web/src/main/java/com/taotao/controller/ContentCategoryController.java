package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.utils.TaotaoResult;
import com.taotao.common.utils.TreeNode;
import com.taotao.service.ContentCategoryService;

@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

	@Autowired
	private ContentCategoryService contentCategoryService;
	
	// 展示分类信息，树形结构
	@RequestMapping("/list")
	@ResponseBody
	public List<TreeNode> getContentCatList(@RequestParam(value = "id",defaultValue = "0") long parentId){
		List<TreeNode> result = contentCategoryService.getContentCatList(parentId);
		return result;
	}
	
	// 添加分类信息
	@RequestMapping("/create")
	@ResponseBody
	public TaotaoResult insertContentCategory(Long parentId,String name){
		TaotaoResult result = contentCategoryService.insertContentCategory(parentId, name);
		return result;
	}
	
	// 删除分类信息
	@RequestMapping("/delete")
	@ResponseBody
	public TaotaoResult deleteContentCategory(Long parentId,Long id){
		TaotaoResult result = contentCategoryService.deleteContentCategory(parentId, id);
		return result;
	}
	
	// 更新分类节点
	@RequestMapping("/update")
	@ResponseBody
	public TaotaoResult updateContentCategory(Long id,String name){
		TaotaoResult result = contentCategoryService.updateContentCategory(id, name);
		return result;
	}
	
}
