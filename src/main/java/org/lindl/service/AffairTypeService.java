package org.lindl.service;

import com.github.pagehelper.PageInfo;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
*/
public interface AffairTypeService {
//    void addAffairType(AffairType affairType);
//
//    void updateAffairType(AffairType affairType);
//
//    void deleteAffairType(int id);

    PageInfo queryAffairTypes(int pageNum, int pageSize);

//    AffairType queryAffairTypeById(int id);
}
