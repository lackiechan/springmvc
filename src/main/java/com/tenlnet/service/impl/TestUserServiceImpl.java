package com.tenlnet.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tenlnet.dao.TestDao;
import com.tenlnet.model.mybatis.TestUser;
import com.tenlnet.service.TestUserService;

@Component
public class TestUserServiceImpl implements TestUserService {
	@Autowired
	private TestDao testDao;
	
	public void insertTestUser(TestUser testUser) {
		testDao.insertTestUser(testUser);
	}

}
