package com.sparta.morningworkout.controller;

import com.sparta.morningworkout.dto.StatusResponseDto;
import com.sparta.morningworkout.dto.chat.ChatRequestDto;
import com.sparta.morningworkout.dto.chat.ChatResponseDto;
import com.sparta.morningworkout.security.UserDetailsImpl;
import com.sparta.morningworkout.service.ChatServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/chat")
public class ChatController {
    private final ChatServiceImpl chatService;
    @PostMapping("/{chatRoomId}")
    public ResponseEntity<StatusResponseDto> sendChat(@AuthenticationPrincipal UserDetailsImpl userDetails, @RequestBody ChatRequestDto chatRequestDto,@PathVariable long chatRoomId) {
        StatusResponseDto statusResponseDto = chatService.sendChat(chatRequestDto, userDetails.getUserId(),chatRoomId);
        HttpHeaders headers = new HttpHeaders();
        if(statusResponseDto.getStatusCode() == 400){
            return ResponseEntity.badRequest().headers(headers).body(statusResponseDto);
        }
        return ResponseEntity.ok().headers(headers).body(statusResponseDto);
    }
    @GetMapping("/{chatRoomId}")
    public List<ChatResponseDto> loadChatRoom(@AuthenticationPrincipal UserDetailsImpl userDetails, @PathVariable long chatRoomId) {
        return chatService.loadChat(userDetails.getUserId(), chatRoomId);
    }

}
