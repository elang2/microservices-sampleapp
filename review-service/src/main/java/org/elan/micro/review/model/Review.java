package org.elan.micro.review.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "item_id")
	private Long itemId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "reviewer_first_name")
	private String reviewerFirstName;

	@Column(name = "reviewer_last_name")
	private String reviewerLastName;

	@Column(name = "review_date")
	private Date reviewDate;

	@Column(name = "rating")
	private int rating;

	@Column(name = "feedback")
	private String userFeedBack;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getReviewerFirstName() {
		return reviewerFirstName;
	}

	public void setReviewerFirstName(String reviewerFirstName) {
		this.reviewerFirstName = reviewerFirstName;
	}

	public String getReviewerLastName() {
		return reviewerLastName;
	}

	public void setReviewerLastName(String reviewerLastName) {
		this.reviewerLastName = reviewerLastName;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getUserFeedBack() {
		return userFeedBack;
	}

	public void setUserFeedBack(String userFeedBack) {
		this.userFeedBack = userFeedBack;
	}

}
