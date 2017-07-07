package com.taotao.service;

import com.taotao.common.utils.EasyUIResult;
import com.taotao.common.utils.TaotaoResult;
import com.taotao.pojo.Content;

public interface ContentService {
	
	EasyUIResult getContentList(long categoryId,Integer page,Integer rows);
	
	TaotaoResult insertContent(Content content);
	
	TaotaoResult editContent(Content content);
	
	// 批量删除
	TaotaoResult deleteContent(String ids);

}
