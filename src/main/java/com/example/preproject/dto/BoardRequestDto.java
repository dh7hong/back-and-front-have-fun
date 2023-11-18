package com.example.preproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class BoardRequestDto {
    private Long id;
    private String title;
    private String contents;
}
