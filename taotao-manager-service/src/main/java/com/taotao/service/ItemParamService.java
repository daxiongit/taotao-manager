package com.taotao.service;

import com.taotao.common.utils.TaotaoResult;

public interface ItemParamService {
	
	TaotaoResult getItemParamByCid(long cid);
	
	TaotaoResult insertItemParam(Long cid,String paramData);

}
