package com.mybao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybao.dao.user.UserDao;
import com.mybao.model.user.User;

@Service
public class IndexService
{
	@Autowired
	private UserDao userDao;

	public void addUser(String name, String number)
	{
		User u = new User();
		u.setName(name);
		u.setNumber(number);

		userDao.getSession().saveOrUpdate(u);
	}
}
