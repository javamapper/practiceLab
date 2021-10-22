package com.javamapper.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskRequest {
    @JsonProperty("requestBody")
	private RequestBody requestBody;

	public RequestBody getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(RequestBody requestBody) {
		this.requestBody = requestBody;
	}
	
}
