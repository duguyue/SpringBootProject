package org.lindl.service;

import org.lindl.entity.User;
import org.springframework.stereotype.Service;

/**
 * Created by lin on 2017/2/1.
 */

public interface UserService {
    public User getUserById(int id);
}
