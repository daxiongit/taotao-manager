package com.taotao.service;

import org.springframework.web.multipart.MultipartFile;

import com.taotao.common.utils.PictureResult;

public interface PictureService {

	PictureResult uploadFile(MultipartFile uploadFile);
	
}
