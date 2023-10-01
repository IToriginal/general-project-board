package com.itoriginal.generalprojectboard.comment.entity;

import java.time.LocalDateTime;

public class BoardComment {

    private Long boardCommentId;
    private Long boardId; // 게시글 고유 아이디
    private String content; // 내용

    private LocalDateTime createdAt; // 생성일자
    private String createdBy; // 생성자
    private LocalDateTime updatedAt; // 수정일자
    private String updatedBy; // 수정자
}
