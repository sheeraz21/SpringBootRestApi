package com.intellectdesign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.intellectdesign.dao.IUserDao;
import com.intellectdesign.dao.UserEntity;

@Component
@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public boolean addUser(UserEntity userEntity) {
	    

		if (userDao.userExists(userEntity.getEmail(), userEntity.isActive())) {
			return false;
		} else {
			userDao.addUser(userEntity);
			
			return true;
		}
	    
	}

	@Override
	public void deleteUser(int Id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(Id);
	}

	@Override
	public void updateUser(UserEntity userEntity) {
		// TODO Auto-generated method stub
		userDao.updateUser(userEntity);
	}

}
