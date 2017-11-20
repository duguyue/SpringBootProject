package org.lindl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lindl.entity.Expense;
import org.lindl.mapper.ExpenseMapper;
import org.lindl.service.ExpenseService;
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
public class ExpenseServiceImpl implements ExpenseService {
    @Resource
    private ExpenseMapper expenseMapper;
    @Override
    public PageInfo queryExpense(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Expense> list=expenseMapper.queryExpense();
        PageInfo<Expense> page=new PageInfo<Expense>(list);
        return page;
    }
}
