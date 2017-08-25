package org.lindl.service;

import org.lindl.entity.AffairType;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
 */
public interface AffairTypeService {
    void addAffairType(AffairType affairType);

    void updateAffairType(AffairType affairType);

    void deleteAffairType(int id);

    List<AffairType> queryAffairType();

    AffairType queryAffairTypeById(int id);
}
