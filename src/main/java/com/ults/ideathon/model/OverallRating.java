package com.ults.ideathon.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OverallRating {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID overallRatingId ;
	
//	private Integer ideaId;
	
	@OneToOne
	private CandidateIdeas candidateIdeas;
	
	private Integer overallRate;
	
	

	public OverallRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OverallRating(UUID overallRatingId, CandidateIdeas candidateIdeas, Integer overallRate) {
		super();
		this.overallRatingId = overallRatingId;
		this.candidateIdeas = candidateIdeas;
		this.overallRate = overallRate;
	}

	public UUID getOverallRatingId() {
		return overallRatingId;
	}

	public void setOverallRatingId(UUID overallRatingId) {
		this.overallRatingId = overallRatingId;
	}

	public CandidateIdeas getCandidateIdeas() {
		return candidateIdeas;
	}

	public void setCandidateIdeas(CandidateIdeas candidateIdeas) {
		this.candidateIdeas = candidateIdeas;
	}

	public Integer getOverallRate() {
		return overallRate;
	}

	public void setOverallRate(Integer overallRate) {
		this.overallRate = overallRate;
	}
	
	
	

}
