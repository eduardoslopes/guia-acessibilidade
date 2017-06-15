package com.acessibilityguide.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acessibilityguide.api.model.Comment;

@RestController
@RequestMapping("/api/comment")
public class CommentController extends AbstractCRUDController<Comment> {

}
