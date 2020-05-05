package com.ults.ideathon.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EventCreation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID eventId;
	
	private String name;
	
	private String description;
	
	private Timestamp fromDate;
	
	private Timestamp toDate;
	
	private Timestamp reviewStartTime;
	
	private Timestamp reviewEndTime;
	
	private Integer novelty;
	
	private Integer feasibility;
	
	private Integer relevance;
	
	@OneToMany(mappedBy="eventCreation")
	private List<Subcategory> subcategory;
	
	@OneToMany(mappedBy="event")
	private List<CandidateIdeas> ideas;
	
	

	public EventCreation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EventCreation(UUID eventId, String name, String description, Timestamp fromDate, Timestamp toDate,
			Timestamp reviewStartTime, Timestamp reviewEndTime, Integer novelty, Integer feasibility, Integer relevance,
			List<Subcategory> subcategory, List<CandidateIdeas> ideas) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.description = description;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.reviewStartTime = reviewStartTime;
		this.reviewEndTime = reviewEndTime;
		this.novelty = novelty;
		this.feasibility = feasibility;
		this.relevance = relevance;
		this.subcategory = subcategory;
		this.ideas = ideas;
	}

	public UUID getEventId() {
		return eventId;
	}

	public void setEventId(UUID eventId) {
		this.eventId = eventId;
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

	public Timestamp getFromDate() {
		return fromDate;
	}

	public void setFromDate(Timestamp fromDate) {
		this.fromDate = fromDate;
	}

	public Timestamp getToDate() {
		return toDate;
	}

	public void setToDate(Timestamp toDate) {
		this.toDate = toDate;
	}

	public Timestamp getReviewStartTime() {
		return reviewStartTime;
	}

	public void setReviewStartTime(Timestamp reviewStartTime) {
		this.reviewStartTime = reviewStartTime;
	}

	public Timestamp getReviewEndTime() {
		return reviewEndTime;
	}

	public void setReviewEndTime(Timestamp reviewEndTime) {
		this.reviewEndTime = reviewEndTime;
	}

	public Integer getNovelty() {
		return novelty;
	}

	public void setNovelty(Integer novelty) {
		this.novelty = novelty;
	}

	public Integer getFeasibility() {
		return feasibility;
	}

	public void setFeasibility(Integer feasibility) {
		this.feasibility = feasibility;
	}

	public Integer getRelevance() {
		return relevance;
	}

	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}

	public List<Subcategory> getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(List<Subcategory> subcategory) {
		this.subcategory = subcategory;
	}

	public List<CandidateIdeas> getIdeas() {
		return ideas;
	}

	public void setIdeas(List<CandidateIdeas> ideas) {
		this.ideas = ideas;
	}
	

	
	

}
