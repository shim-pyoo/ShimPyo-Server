package com.hsu.shimpyoo.domain.chatbot.service;


import com.hsu.shimpyoo.domain.chatbot.web.dto.ModifyChatRoomTitleDto;
import com.hsu.shimpyoo.global.response.CustomAPIResponse;
import org.springframework.http.ResponseEntity;

public interface ChatService {
    ResponseEntity<CustomAPIResponse<?>> makeChatRoom();
    ResponseEntity<CustomAPIResponse<?>> askForChat(String content);
    ResponseEntity<CustomAPIResponse<?>> modifyChatRoomTitle(ModifyChatRoomTitleDto requestDto);

}

