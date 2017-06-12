package com.aishangfun.restful.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aishangfun.restful.dao.IUserDao;
import com.aishangfun.restful.service.IUserService;
import com.aishangfun.restful.vo.UserVO;

/**
 * Created by wesley on 17-6-11.
 */

@Service("userService")
public class UserService implements IUserService {

	@Autowired
    private IUserDao userDao;
	
    public UserVO getUser(int id) {
      UserVO user =   userDao.getUser(id);
        return user;
    }
}
