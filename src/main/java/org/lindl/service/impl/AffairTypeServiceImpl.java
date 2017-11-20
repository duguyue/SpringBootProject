package org.lindl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lindl.entity.Affair;
import org.lindl.entity.AffairType;
import org.lindl.mapper.AffairTypeMapper;
import org.lindl.service.AffairTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:事务类别管理服务类
 * 作者:LinDL
 * 日期:2017/9/1
 */
@Service
public class AffairTypeServiceImpl implements AffairTypeService{
    @Resource
    private AffairTypeMapper affairTypeMapper;
    @Override
    public PageInfo queryAffairTypes(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<AffairType> list=affairTypeMapper.queryAffairTypes();
        PageInfo<AffairType> page=new PageInfo<AffairType>(list);
        return page;
    }
}
