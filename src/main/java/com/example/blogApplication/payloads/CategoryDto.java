package com.example.blogApplication.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    private Integer categoryId;
    @NotBlank(message = "Title is required")
    private String categoryTitle;
    @NotBlank(message = "Description is required")
    private String categoryDescription;
}
