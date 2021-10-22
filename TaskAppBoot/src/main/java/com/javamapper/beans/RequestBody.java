package com.javamapper.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestBody {
    @JsonProperty("task")
	private Task task;
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
}
