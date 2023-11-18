package com.example.preproject.dto;

import com.example.preproject.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class BoardResponseDto {
    private Long id;
    private String nickname;
    private String title;
    private int likes;
    private LocalDateTime createdAt;

    public BoardResponseDto(Board board)
    {
        this.id = board.getId();
        this.nickname = board.getUser().getNickname();
        this.title = board.getTitle();
        this.likes = board.getLikes();
        this.createdAt = board.getCreatedAt();
    }
}
