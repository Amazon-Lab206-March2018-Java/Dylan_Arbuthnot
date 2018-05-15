package com.darbuth.loginreg.services;

import java.util.Date;

import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.darbuth.loginreg.models.User;
import com.darbuth.loginreg.repositories.RoleRepo;
import com.darbuth.loginreg.repositories.UserRepo;

@Service
public class UserService  implements ApplicationListener<AuthenticationSuccessEvent> {

	private UserRepo ur;
	private RoleRepo rr;
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public UserService(UserRepo ur,
			RoleRepo rr,
			BCryptPasswordEncoder bCryptPasswordEncoder) {
		this.ur = ur;
		this.rr = rr;
		this.bCryptPasswordEncoder = bCryptPasswordEncoder;
	}
	
	public void saveWithUserRole(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(rr.findByName("ROLE_USER"));
		ur.save(user);
	}
	
	public void saveUserWithAdminRole(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles(rr.findByName("ROLE_ADMIN"));
		ur.save(user);
	}
	
	public User findByUsername(String username) {
		return ur.findByUsername(username);
	}

	@Override
	public void onApplicationEvent(AuthenticationSuccessEvent event) {
		UserDetails user = (UserDetails) event.getAuthentication().getPrincipal();
		User u = ur.findByUsername(user.getUsername());
		u.setLastSignIn(new Date());
		ur.save(u);
	}
	
}
