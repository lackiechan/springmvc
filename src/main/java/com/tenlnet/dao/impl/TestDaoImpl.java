package com.tenlnet.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tenlnet.dao.TestDao;
import com.tenlnet.model.mybatis.TestUser;
import com.tenlnet.model.mybatis.mapper.TestMapper;
@Component
public class TestDaoImpl implements TestDao {
	@Autowired
	private TestMapper testMapper;
//	private SqlSessionTemplate sqlSessionTemplate; 
//	
//	public void addTest() {	// TODO Auto-generated method stub
//		sqlSessionTemplate.insert("", null);
//	}
//
//	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//		this.sqlSessionTemplate = sqlSessionTemplate;
//	}

	public void insertTestUser(TestUser testUser) {
		testMapper.insertTest(testUser);
	}

	
}
