package com.ults.ideathon.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;

@Entity
public class CandidateIdeas {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID ideaId;
	
    private String title;
	
	private String description;
	
//	private Integer userId;
	
	@OneToOne
	private UserData user;
	
	private Integer doc;
	
//    private Integer subcategoryId;
	
	@ManyToOne
	private Subcategory subCat;
	
	private Integer isDraft;
	
//    private Integer eventId;
	
	@ManyToOne
	private EventCreation event;
	
    private Timestamp postedDate;
    
    @OneToMany(mappedBy="idea")
	private List<ReviewerComment> reviewerComment;
    
    

	public CandidateIdeas() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateIdeas(UUID ideaId, String title, String description, UserData user, Integer doc, Subcategory subCat,
			Integer isDraft, EventCreation event, Timestamp postedDate, List<ReviewerComment> reviewerComment) {
		super();
		this.ideaId = ideaId;
		this.title = title;
		this.description = description;
		this.user = user;
		this.doc = doc;
		this.subCat = subCat;
		this.isDraft = isDraft;
		this.event = event;
		this.postedDate = postedDate;
		this.reviewerComment = reviewerComment;
	}

	public UUID getIdeaId() {
		return ideaId;
	}

	public void setIdeaId(UUID ideaId) {
		this.ideaId = ideaId;
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

	public UserData getUser() {
		return user;
	}

	public void setUser(UserData user) {
		this.user = user;
	}

	public Integer getDoc() {
		return doc;
	}

	public void setDoc(Integer doc) {
		this.doc = doc;
	}

	public Subcategory getSubCat() {
		return subCat;
	}

	public void setSubCat(Subcategory subCat) {
		this.subCat = subCat;
	}

	public Integer getIsDraft() {
		return isDraft;
	}

	public void setIsDraft(Integer isDraft) {
		this.isDraft = isDraft;
	}

	public EventCreation getEvent() {
		return event;
	}

	public void setEvent(EventCreation event) {
		this.event = event;
	}

	public Timestamp getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Timestamp postedDate) {
		this.postedDate = postedDate;
	}

	public List<ReviewerComment> getReviewerComment() {
		return reviewerComment;
	}

	public void setReviewerComment(List<ReviewerComment> reviewerComment) {
		this.reviewerComment = reviewerComment;
	}
    
    
    

	
}
