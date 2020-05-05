package com.ults.ideathon.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Subcategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID subcategoryId;
	
	private String title;
	
	private String description;
	
//	private Integer eventId;
	
	@ManyToOne
	private EventCreation eventCreation;
	
	@OneToMany(mappedBy="subCat")
	private List<CandidateIdeas> candtIdeas;
	
	

	public Subcategory() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subcategory(UUID subcategoryId, String title, String description, EventCreation eventCreation,
			List<CandidateIdeas> candtIdeas) {
		super();
		this.subcategoryId = subcategoryId;
		this.title = title;
		this.description = description;
		this.eventCreation = eventCreation;
		this.candtIdeas = candtIdeas;
	}

	public UUID getSubcategoryId() {
		return subcategoryId;
	}

	public void setSubcategoryId(UUID subcategoryId) {
		this.subcategoryId = subcategoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EventCreation getEventCreation() {
		return eventCreation;
	}

	public void setEventCreation(EventCreation eventCreation) {
		this.eventCreation = eventCreation;
	}

	public List<CandidateIdeas> getCandtIdeas() {
		return candtIdeas;
	}

	public void setCandtIdeas(List<CandidateIdeas> candtIdeas) {
		this.candtIdeas = candtIdeas;
	}
	

	
	

}
