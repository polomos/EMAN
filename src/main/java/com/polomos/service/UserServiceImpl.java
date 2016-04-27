package com.polomos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.polomos.dao.UserDao;
import com.polomos.dao.model.User;


@Service("userService")
public class UserServiceImpl implements UserService {
    
	@Autowired
	UserDao userDao;
	
    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

	@Override
	public void addUser(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
    
}
