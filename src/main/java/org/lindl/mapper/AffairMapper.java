package org.lindl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.lindl.entity.Affair;

import java.util.List;

/**
 * 描述:
 * 作者:LinDL
 * 日期:2017/8/25
 */
@Mapper
public interface AffairMapper {
    void addAffair(Affair affair);

    List<Affair> queryAffairs();

    void deleteAffair(int id);

    Affair queryAffairById(int id);
}
