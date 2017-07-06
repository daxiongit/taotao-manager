package com.taotao.service;

import java.util.List;

import com.taotao.common.utils.TaotaoResult;
import com.taotao.common.utils.TreeNode;

public interface ContentCategoryService {
	
	List<TreeNode> getContentCatList(long parentId);
	
	TaotaoResult insertContentCategory(long parentId,String name);
	
	TaotaoResult deleteContentCategory(long parentId,long id);
	
	TaotaoResult updateContentCategory(long id,String name);

}
