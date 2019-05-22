package com.cnten.partybuildInter.modular.platnotice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cnten.partybuildInter.modular.platnotice.dao.PlatNoticeMapper;
import com.cnten.partybuildInter.modular.platnotice.entity.PlatNotice;
import com.cnten.partybuildInter.modular.platnotice.service.PlatNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service(interfaceClass = PlatNoticeService.class)
@Component
public class PlatNoticeServiceImpl implements PlatNoticeService{

    @Autowired
    private PlatNoticeMapper platNoticeMapper;

    public List<PlatNotice> getAllPlatNotice(){
        return platNoticeMapper.selectAll();
    }

}
