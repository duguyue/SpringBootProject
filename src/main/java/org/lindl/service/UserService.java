package org.lindl.service;

import com.github.pagehelper.PageInfo;

/**
 * Created by lin on 2017/2/1.
 */

public interface UserService {
    PageInfo queryUsers(int pageNum,int pageSize);
}
