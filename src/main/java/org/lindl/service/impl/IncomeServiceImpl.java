package org.lindl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lindl.entity.Income;
import org.lindl.mapper.IncomeMapper;
import org.lindl.service.IncomeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/9/1
 */
@Service
public class IncomeServiceImpl implements IncomeService{
    @Resource
    private IncomeMapper incomeMapper;
    @Override
    public PageInfo queryIncome(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Income> list=incomeMapper.queryIncome();
        PageInfo<Income> page=new PageInfo<Income>(list);
        return page;
    }
}
