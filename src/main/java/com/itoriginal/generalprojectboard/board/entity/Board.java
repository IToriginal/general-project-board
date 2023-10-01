package com.itoriginal.generalprojectboard.board.entity;

import java.time.LocalDateTime;

public class Board {

    private Long boardId;
    private String title; // 제목
    private String content; // 내용
    private String hashtag; // 해시태그

    private LocalDateTime createdAt; // 생성일자
    private String createdBy; // 생성자
    private LocalDateTime updatedAt; // 수정일자
    private String updatedBy; // 수정자
}
