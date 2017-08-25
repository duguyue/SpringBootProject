package org.lindl.service;

import org.lindl.entity.Result;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
 */
public interface ExpenseService {
    public Result queryExpense(int page, int pageSize);

    public int countExpense();
}
