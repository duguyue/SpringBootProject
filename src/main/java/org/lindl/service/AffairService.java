package org.lindl.service;

import com.github.pagehelper.PageInfo;
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

    /**
     * 查询所有事务列表
     * @return
     */
//    List<Affair> queryAffairs();

    PageInfo queryAffairs(int pageNum,int pageSize);

//    Affair queryAffairById(int id);
}
