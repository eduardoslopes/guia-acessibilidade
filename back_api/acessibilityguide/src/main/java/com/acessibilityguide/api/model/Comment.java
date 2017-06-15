package com.acessibilityguide.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

@Entity
@Table(name = "comment")
public class Comment extends Model {

	@Id
    private Long id;

    private String content;

    @ManyToOne(optional = false)
    private Marker marker;

    @ManyToOne(optional = false)
    private GuideUser user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Marker getMarker() {
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	public GuideUser getUser() {
		return user;
	}

	public void setUser(GuideUser user) {
		this.user = user;
	}
	
    
    
}
