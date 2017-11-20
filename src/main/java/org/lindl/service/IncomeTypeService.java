package org.lindl.service;

import com.github.pagehelper.PageInfo;
import org.lindl.entity.Result;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
 */
public interface IncomeTypeService {
    PageInfo queryIncomeTypes(int pageNum, int pageSize);

//    public int countIncomeType();
}
