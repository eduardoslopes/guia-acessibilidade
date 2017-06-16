package com.acessibilityguide.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.acessibilityguide.api.model.Comment;
import com.acessibilityguide.api.model.query.QComment;

@Service
public class CommentService extends AbstractCRUDService<Comment> {

	@Override
	public Comment findById(Long id) {
		return new QComment().id.eq(id).findUnique();
	}

	@Override
	public List<Comment> findAll() {
		return new QComment().findList();
	}

}
