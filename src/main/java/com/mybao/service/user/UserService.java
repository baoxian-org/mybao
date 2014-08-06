package com.mybao.service.user;

import org.springframework.beans.factory.annotation.Autowired;

import com.mybao.dao.user.UserDao;
import com.mybao.model.user.User;

public class UserService {
	@Autowired 
	private UserDao userDao;
	
	public  void addUser(String name,String number){
		
		User u=new User();
		
		u.setName(name);
		u.setNumber(number);

		userDao.getSession().save(u);
	}
}
