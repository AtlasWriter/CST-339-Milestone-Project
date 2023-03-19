package com.gcu.service;

import java.util.List;

import com.gcu.entity.UserEntity;

public interface UserService {
	List<UserEntity> getAllStudents();
	
	UserEntity saveUser(UserEntity userEntity);
	
	UserEntity getUserById(Long id);
	
	UserEntity updateUser(UserEntity userEntity);
	
	void deleteUserById(Long id);
}
