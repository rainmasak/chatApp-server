package com.rainmk.chatApp.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.rainmk.chatApp.dto.ChatMessage;

public class ChatCache {
	
	public static List<ChatMessage> allMessages = Collections.synchronizedList(new ArrayList<ChatMessage>()); 

}
