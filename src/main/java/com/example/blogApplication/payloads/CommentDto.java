package com.example.blogApplication.payloads;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class CommentDto {

    private int id;

    private String content;

}