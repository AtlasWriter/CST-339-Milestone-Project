package com.gcu.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gcu.entity.UserEntity;
import com.gcu.repository.UserRepository;
import com.gcu.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository studentRepository) {
		super();
		this.userRepository = studentRepository;
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

	@Override
	public List<UserEntity> getAllStudents() {
		return userRepository.findAll();
	}

	@Override
	public UserEntity getUserById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public UserEntity saveUser(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Override
	public UserEntity updateUser(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

}
