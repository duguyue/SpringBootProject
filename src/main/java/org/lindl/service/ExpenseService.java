package org.lindl.service;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.Result;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
 */
public interface ExpenseService {
    PageInfo queryExpense(int pageNum, int pageSize);

}
