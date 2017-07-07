package com.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.utils.EasyUIResult;
import com.taotao.common.utils.TaotaoResult;
import com.taotao.pojo.Content;
import com.taotao.service.ContentService;

@Controller
@RequestMapping("/content")
public class ContentController {

	@Autowired
	private ContentService contentService;
	
	// 根据内容分类查询内容列表
	@RequestMapping("/query/list")
	@ResponseBody
	public EasyUIResult getContentList(Long categoryId,
			@RequestParam(defaultValue="0") Integer page,@RequestParam(defaultValue="20")Integer rows){
		EasyUIResult result = contentService.getContentList(categoryId, page, rows);
		return result;
	}
	
	// 选中分类，添加内容
	@RequestMapping("/save")
	@ResponseBody
	public TaotaoResult insertContent(Content content){
		TaotaoResult result = contentService.insertContent(content);
		return result;
	}
	
	// 编辑内容
	@RequestMapping("/edit")
	@ResponseBody
	public TaotaoResult editContent(Content content){
		TaotaoResult result = contentService.editContent(content);
		return result;
	}
	
	// 批量删除内容
	@RequestMapping("/delete")
	@ResponseBody
	public TaotaoResult deleteContent(String ids){
		System.out.println("前端传入的IDS ： " + ids);
		return TaotaoResult.ok();
	}
	
}
