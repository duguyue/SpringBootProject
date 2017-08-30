package org.lindl.service;

import org.lindl.entity.Affair;

import java.util.List;

/**
 * 描述:事务管理服务类
 * 作者:LinDL
 * 日期:2017/8/25
 */
public interface AffairService {
    /**
     * 添加事务
     * @param affair
     */
    void addAffair(Affair affair);

//    void updateAffair(Affair affair);
//
//    void deleteAffair(int id);
//
//    List<Affair> queryAffairs();
//
//    Affair queryAffairById(int id);
}
