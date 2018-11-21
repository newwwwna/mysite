package com.javalec.mysite.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.mysite.vo.UsersVO;

@Repository
public class UsersDao {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insert(UsersVO vo) {
		mybatis.insert("UsersDao.insert", vo);
	}
	
	public UsersVO getuservo(UsersVO vo) {
		return mybatis.selectOne("UsersDao.getuservo", vo);
	}
	
}
