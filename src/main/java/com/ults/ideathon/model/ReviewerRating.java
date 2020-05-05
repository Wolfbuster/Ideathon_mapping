package com.ults.ideathon.model;

import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class ReviewerRating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID ratingId ;
	
//	private Integer ideaId;
	
	@OneToOne
	private CandidateIdeas candIdea;
	
	private Integer novelty;
	
	private Integer feasibility;
	
	private Integer relevance;
	
	private Integer totalRate;
	
	@CreationTimestamp
	private Timestamp reviewedDate;
	
	//private Integer reviewerId
	
	@OneToOne
	private UserData userData;
	
	

	public ReviewerRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewerRating(UUID ratingId, CandidateIdeas candIdea, Integer novelty, Integer feasibility,
			Integer relevance, Integer totalRate, Timestamp reviewedDate, UserData userData) {
		super();
		this.ratingId = ratingId;
		this.candIdea = candIdea;
		this.novelty = novelty;
		this.feasibility = feasibility;
		this.relevance = relevance;
		this.totalRate = totalRate;
		this.reviewedDate = reviewedDate;
		this.userData = userData;
	}

	public UUID getRatingId() {
		return ratingId;
	}

	public void setRatingId(UUID ratingId) {
		this.ratingId = ratingId;
	}

	public CandidateIdeas getCandIdea() {
		return candIdea;
	}

	public void setCandIdea(CandidateIdeas candIdea) {
		this.candIdea = candIdea;
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

	public Integer getTotalRate() {
		return totalRate;
	}

	public void setTotalRate(Integer totalRate) {
		this.totalRate = totalRate;
	}

	public Timestamp getReviewedDate() {
		return reviewedDate;
	}

	public void setReviewedDate(Timestamp reviewedDate) {
		this.reviewedDate = reviewedDate;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	

}
