package com.eror.server2.service;


import com.eror.server2.generic.GenericService;
import com.eror.server2.model.User;

public interface UserService extends GenericService<User> {

	boolean authenticate(String email, String password);

	User findByEmail(String email);

}
