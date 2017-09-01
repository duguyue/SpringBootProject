package org.lindl.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.lindl.entity.User;

import java.util.List;

/**
 * Created by lin on 2017/1/29.
 */
@Mapper
public interface UserMapper {
    List<User> queryUsers();
}
