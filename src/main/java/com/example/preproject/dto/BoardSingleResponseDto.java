package com.example.preproject.dto;

import com.example.preproject.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class BoardSingleResponseDto {
    private Long id;
    private String nickname;
    private String title;
    private String contents;
    private LocalDateTime createdAt;

    public BoardSingleResponseDto(Board board)
    {
        this.id = board.getId();
        this.nickname = board.getUser().getNickname();
        this.title = board.getTitle();
        this.contents = board.getContents();
        this.createdAt = board.getCreatedAt();
    }
}
