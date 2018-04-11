package com.projectdata.model;

public class Review {
	private String userName;
	private int ratting;
	private boolean approved;

	public Review() {

	}

	public Review(String userName, int ratting, boolean approved) {
		this.userName = userName;
		this.ratting = ratting;
		this.approved = approved;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRatting() {
		return ratting;
	}

	public void setRatting(int ratting) {
		this.ratting = ratting;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

}
