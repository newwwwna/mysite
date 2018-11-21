package com.javalec.mysite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.mysite.dao.UsersDao;
import com.javalec.mysite.vo.UsersVO;

@Service("usersService")
public class UsersService {

	@Autowired
	private UsersDao dao;
	
	public void insertuser(UsersVO vo) {
		dao.insert(vo);
	}
	
	public UsersVO getuservo(UsersVO vo) {
		return dao.getuservo(vo);
	}
}
