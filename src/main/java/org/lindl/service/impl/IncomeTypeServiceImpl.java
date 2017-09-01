package org.lindl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lindl.entity.IncomeType;
import org.lindl.mapper.IncomeTypeMapper;
import org.lindl.service.IncomeTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/9/1
 */
@Service
public class IncomeTypeServiceImpl implements IncomeTypeService{
    @Resource
    private IncomeTypeMapper incomeTypeMapper;
    @Override
    public PageInfo queryIncomeTypes(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<IncomeType> list=incomeTypeMapper.queryIncomeTypes();
        PageInfo<IncomeType> page=new PageInfo<IncomeType>(list);
        return page;
    }
}
