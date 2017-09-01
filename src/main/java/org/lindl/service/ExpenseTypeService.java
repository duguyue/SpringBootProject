package org.lindl.service;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.ExpenseType;
import org.lindl.entity.Result;

import java.util.List;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
 */
public interface ExpenseTypeService {
    PageInfo queryExpenseTypes(int pageNum, int pageSize);

//    public int countExpenseType();
}
