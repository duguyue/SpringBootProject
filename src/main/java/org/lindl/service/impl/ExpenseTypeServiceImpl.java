package org.lindl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lindl.entity.ExpenseType;
import org.lindl.mapper.ExpenseTypeMapper;
import org.lindl.service.ExpenseTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/9/1
 */
@Service
public class ExpenseTypeServiceImpl implements ExpenseTypeService{

    @Resource
    private ExpenseTypeMapper expenseTypeMapper;
    @Override
    public PageInfo queryExpenseTypes(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<ExpenseType> list=expenseTypeMapper.queryExpenseTypes();
        PageInfo<ExpenseType> page=new PageInfo<ExpenseType>(list);
        return page;
    }
}
