package com.example.demo.Services;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.User;
import com.example.demo.Repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	
	
	
    public String processRegistration(String username, String password) {
    	
    	User user = new User();
    	user.setUsername(username);
    	user.setPassword(password);
    	user.setAdmin(false);
        repo.save(user);
        return "Registration Successful";
        
    }
	
	
	public List<User> getAllUsers(){
		return repo.findAll().stream().toList();
	}
	
	public User findRegisteredUserByUserName(String username) {
	 return   repo.findByUsername(username).get();
	}

}
