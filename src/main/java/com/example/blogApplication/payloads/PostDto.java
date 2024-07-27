package com.example.blogApplication.payloads;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;
@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private  Integer postId;
    @NotBlank(message = "title is required")
    private  String title;
    @NotBlank(message = "content is required")
    private  String content;
    private  String imageName;
    private Data addedDate;
    private CategoryDto category;

    private UserDto user;

//    private Set<CommentDto> comments=new HashSet<>();
}
