package com.acessibilityguide.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acessibilityguide.api.exceptions.UserNotFoundException;
import com.acessibilityguide.api.model.GuideUser;
import com.acessibilityguide.api.model.query.QGuideUser;

@Service
public class GuideUserService extends AbstractCRUDService<GuideUser> {

	@Override
	public GuideUser findById(Long id) {
		return new QGuideUser().id.eq(id).findUnique();
	}

	@Override
	public List<GuideUser> findAll() {
		return new QGuideUser().findList();
	}
	
	public GuideUser login(GuideUser user){
		GuideUser nUser = new QGuideUser().and()
				.username.eq(user.getUsername())
				.password.eq(user.getPassword())
			.endAnd().findUnique();
		if(nUser == null){
			throw new UserNotFoundException("usuário ou senha não encontrado");
		}
		
		return nUser;
	}

}
