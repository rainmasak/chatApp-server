package com.rainmk.chatApp.dto;

import java.util.ArrayList;
import java.util.List;

public class ChatMessage {

	private String type;
	private String text;
	private String name;
	private List<String> seenBy = new ArrayList<>();
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSeenBy() {
		return seenBy;
	}
	public void setSeenBy(List<String> seenBy) {
		this.seenBy = seenBy;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

}
