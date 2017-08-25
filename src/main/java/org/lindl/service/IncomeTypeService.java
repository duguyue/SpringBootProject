package org.lindl.service;

import org.lindl.entity.Result;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
 */
public interface IncomeTypeService {
    public Result queryIncomeType(int page, int pageSize);

    public int countIncomeType();
}
