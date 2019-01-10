package com.cnten.partybuildInter.modular.platnotice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnten.partybuildInter.modular.platnotice.dao.PlatNoticeMapper;
import com.cnten.partybuildInter.modular.platnotice.entity.PlatNotice;

@Service
public class PlatNoticeService {
	@Autowired
    private PlatNoticeMapper platNoticeMapper;
	
	public List<PlatNotice> getAllPlatNotice(){
		return platNoticeMapper.selectAll();
	}
	
}
