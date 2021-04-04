package com.arp.response;

import java.time.LocalDateTime;
import java.util.List;

public class MessageResponse {

	private int code;
	private String status;
	private String message;
	private List<String> errorMessages;
	private LocalDateTime timestamp;
	private Object data;

	public MessageResponse(String message) {
		this.message = message;
	}

	public MessageResponse(int code, String status, String message, List<String> errorMessages, LocalDateTime timestamp,
			Object data) {
		this.code = code;
		this.status = status;
		this.message = message;
		this.errorMessages = errorMessages;
		this.timestamp = timestamp;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
