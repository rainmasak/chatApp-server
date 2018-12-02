package com.rainmk.chatApp.controller;

import java.util.List;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rainmk.chatApp.config.ChatCache;
import com.rainmk.chatApp.dto.ChatMessage;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody String welcome() {
		return "Chat app version 1.0";
	}
	
	@CrossOrigin(origins = "https://192.168.1.18:3000")
	@RequestMapping(value = "/getmsg", method = RequestMethod.GET)
	public @ResponseBody List<ChatMessage> getMessages() {
		return ChatCache.allMessages;
	}
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public ChatMessage newMessage(ChatMessage message) throws Exception {
		ChatCache.allMessages.add(message);
		return message;
	}
	
}
