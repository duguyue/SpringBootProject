package org.lindl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lindl.entity.Affair;
import org.lindl.mapper.AffairMapper;
import org.lindl.service.AffairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:事务管理服务类
 * 作者:LinDL
 * 日期:2017/8/25
 */
@Service
public class AffairServiceImpl implements AffairService{
    @Resource
    private AffairMapper affairMapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addAffair(Affair affair) {
        affairMapper.addAffair(affair);
    }

    @Override
    public PageInfo queryAffairs(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Affair> list=affairMapper.queryAffairs();
        PageInfo<Affair> page=new PageInfo(list);
        return page;
    }
}
