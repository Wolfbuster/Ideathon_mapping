package com.ults.ideathon.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ReviewerComment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID commentId ;
	
//	private Integer ideaId;
	
	@ManyToOne
	private CandidateIdeas idea;
	
//	private Integer reviewerId;
	
	@OneToOne
	private UserData userData;
	
	private String comment;
	
	private String response;
	
	private Integer ideaStatus;
	
	
	

	public ReviewerComment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewerComment(UUID commentId, CandidateIdeas idea, UserData userData, String comment, String response,
			Integer ideaStatus) {
		super();
		this.commentId = commentId;
		this.idea = idea;
		this.userData = userData;
		this.comment = comment;
		this.response = response;
		this.ideaStatus = ideaStatus;
	}

	public UUID getCommentId() {
		return commentId;
	}

	public void setCommentId(UUID commentId) {
		this.commentId = commentId;
	}

	public CandidateIdeas getIdea() {
		return idea;
	}

	public void setIdea(CandidateIdeas idea) {
		this.idea = idea;
	}

	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Integer getIdeaStatus() {
		return ideaStatus;
	}

	public void setIdeaStatus(Integer ideaStatus) {
		this.ideaStatus = ideaStatus;
	}
	
	

	
	
	
	
}
