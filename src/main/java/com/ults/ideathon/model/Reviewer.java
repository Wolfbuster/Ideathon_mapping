package com.ults.ideathon.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Reviewer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id ;
	
//	private Integer eventId;
	
	@OneToOne
	private EventCreation eventCreation;
	
//	private Integer userId;
	
	@OneToOne
	private UserData userData;
	
//	private Integer subcategoryId;
	
	@OneToOne
	private Subcategory subcategory;
	
	

	public Reviewer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reviewer(UUID id, EventCreation eventCreation, UserData userData, Subcategory subcategory) {
		super();
		this.id = id;
		this.eventCreation = eventCreation;
		this.userData = userData;
		this.subcategory = subcategory;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public EventCreation getEventCreation() {
		return eventCreation;
	}

	public void setEventCreation(EventCreation eventCreation) {
		this.eventCreation = eventCreation;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public Subcategory getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(Subcategory subcategory) {
		this.subcategory = subcategory;
	}
	
	
	
	

}
