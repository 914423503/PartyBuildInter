package com.cnten.partybuildInter.interf.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnten.partybuildInter.modular.platnotice.entity.PlatNotice;
import com.cnten.partybuildInter.modular.platnotice.service.PlatNoticeService;

@RestController
public class FileController {
	@Autowired
	private PlatNoticeService platNoticeService;
	
	
	@RequestMapping("/queryallnotice")
	public List<PlatNotice> getAllPlatNotice(){
		return platNoticeService.getAllPlatNotice();
	}
}