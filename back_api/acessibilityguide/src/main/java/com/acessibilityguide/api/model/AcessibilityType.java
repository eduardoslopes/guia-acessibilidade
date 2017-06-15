package com.acessibilityguide.api.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.avaje.ebean.Model;

@Entity
@Table(name= "acessibility_type")
public class AcessibilityType extends Model {
	
	@Id
    private Long id;

    private String name;

    private Boolean another;

    @ManyToMany
    private List<Marker> markers;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getAnother() {
		return another;
	}

	public void setAnother(Boolean another) {
		this.another = another;
	}

	public List<Marker> getMarkers() {
		return markers;
	}

	public void setMarkers(List<Marker> markers) {
		this.markers = markers;
	}
    
    

}
