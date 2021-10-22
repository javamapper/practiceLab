package com.javamapper.beans;

public class TaskResponse {
	private Status status;
	
	public TaskResponse(Status status) {
		super();
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
