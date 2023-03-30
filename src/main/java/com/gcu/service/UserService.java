package com.gcu.service;

import java.util.List;

import com.gcu.entity.UserEntity;

public interface UserService {
	void deleteUserById(Long id);
 
	List<UserEntity> getAllStudents();
 
	UserEntity getUserById(Long id);

	UserEntity saveUser(UserEntity userEntity);

	UserEntity updateUser(UserEntity userEntity);
}
