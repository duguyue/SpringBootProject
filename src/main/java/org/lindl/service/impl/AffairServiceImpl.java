package org.lindl.service.impl;

import org.lindl.entity.Affair;
import org.lindl.mapper.AffairMapper;
import org.lindl.service.AffairService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述:事务管理服务类
 * 作者:LinDL
 * 日期:2017/8/25
 */
@Service
public class AffairServiceImpl implements AffairService{
    @Resource
    private AffairMapper affairMapper;


    @Override
    public void addAffair(Affair affair) {
        affairMapper.addAffair(affair);
    }
}
