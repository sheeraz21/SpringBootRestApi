package com.intellectdesign.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.intellectdesign.dao.UserEntity;



@Component
@Service
public interface IUserService {
	
	public boolean addUser(UserEntity userEntity);
	
	public void deleteUser(int Id);
	
	public void updateUser(UserEntity userEntity);
	

}
