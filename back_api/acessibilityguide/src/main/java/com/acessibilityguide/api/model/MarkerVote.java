package com.acessibilityguide.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

@Entity
@Table(name = "marker_vote")
public class MarkerVote extends Model {

	@Id
	private Long id;
	
	@ManyToOne(optional = false)
	private GuideUser user;
	
	@ManyToOne(optional = false)
	private Marker marker;
	
	private VoteType voteType;

	
	public VoteType getVoteType() {
		return voteType;
	}

	public void setVoteType(VoteType voteType) {
		this.voteType = voteType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GuideUser getUser() {
		return user;
	}

	public void setUser(GuideUser user) {
		this.user = user;
	}

	public Marker getMarker() {
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}
	
	
}
