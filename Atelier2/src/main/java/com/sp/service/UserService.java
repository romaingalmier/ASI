package com.sp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.model.User;
import com.sp.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository uRepository;
	public void addUser(User u) {
		User createdUser=uRepository.save(u);
		System.out.println(createdUser);
	}
	
	public User getUser(int id) {
		Optional<User> hOpt =uRepository.findById(id);
		if (hOpt.isPresent()) {
			return hOpt.get();
		}else {
			return null;
		}
	}
	public List<User> findAll(){
		List<User> ulist = (List<User>) uRepository.findAll();
		return ulist;
	}
	
	public List<User> findName(String name){
		List<User> ulist = uRepository.findByName(name);
		return ulist;
	}

	public void CheckUser(User user) {
		// TODO Auto-generated method stub
		List<User> listUser = findName(user.getName());
		for (User userdb : listUser) {
			if (userdb.getPassword() == user.getPassword()) {
				System.out.println("loginOK");
			
			}
				
			
		}
	}
	

}
