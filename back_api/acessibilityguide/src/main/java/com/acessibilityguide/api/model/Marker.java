package com.acessibilityguide.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "marker")
public class Marker extends Model {

	@Id
	private Long id;
	
	private String name;

    private String description;

    private Double latitude;

    private Double longitude;
    
    private String completeAddress;
    
    private Integer votes;
    
    @ManyToOne(optional = false)
    private MarkerType markerType;

    @ManyToOne(optional = false)
    private GuideUser user;

    @ManyToMany(mappedBy = "markers")
    private List<AcessibilityType> acessibilityTypes;

    
	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public MarkerType getMarkerType() {
		return markerType;
	}

	public void setMarkerType(MarkerType markerType) {
		this.markerType = markerType;
	}

	public GuideUser getUser() {
		return user;
	}

	public void setUser(GuideUser user) {
		this.user = user;
	}

	public List<AcessibilityType> getAcessibilityTypes() {
		return acessibilityTypes;
	}

	public void setAcessibilityTypes(List<AcessibilityType> acessibilityTypes) {
		this.acessibilityTypes = acessibilityTypes;
	}

	public void sumVote(Integer count) {
		this.votes += count;
	}
    
	
}
