package com.acessibilityguide.api.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.acessibilityguide.api.model.GuideUser;
import com.acessibilityguide.api.model.query.QGuideUser;


public class UserDatailServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		GuideUser user = new QGuideUser().password.eq(username).findUnique();
		if(user != null){
			User authUser = new User(user.getUsername(), user.getPassword(),
					AuthorityUtils.createAuthorityList("ROLE_ADMIN"));
			return authUser;
		}else{
			throw new UsernameNotFoundException(
					"could not find the user '" + username + "'");
		}
	}
	
	
}
