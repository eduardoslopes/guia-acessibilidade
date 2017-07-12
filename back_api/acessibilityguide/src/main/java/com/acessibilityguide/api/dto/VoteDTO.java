package com.acessibilityguide.api.dto;

import com.acessibilityguide.api.model.VoteType;

public class VoteDTO {

	private Long markerId;
	private VoteType voteType;
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getMarkerId() {
		return markerId;
	}
	public void setMarkerId(Long markerId) {
		this.markerId = markerId;
	}
	public VoteType getVoteType() {
		return voteType;
	}
	public void setVoteType(VoteType voteType) {
		this.voteType = voteType;
	}
	
	
	
}
