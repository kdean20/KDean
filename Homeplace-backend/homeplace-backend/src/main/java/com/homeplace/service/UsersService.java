package com.homeplace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeplace.entity.Users;
import com.homeplace.repository.UsersRepository;

@Service
public class UsersService {
@Autowired
UsersRepository usersRepository;

public void saveUsers(Users users) {
	usersRepository.save(users);
	}

public Users loginUsers(Users users) {
	return usersRepository.findUsersByEmailAndPassword(users.getEmail(), users.getPassword());
	}

}
