package com.eror.service;

import com.eror.generic.GenericService;
import com.eror.model.User;

public interface UserService extends GenericService<User> {

	boolean authenticate(String email, String password);

	User findByEmail(String email);

}
