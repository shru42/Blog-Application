package com.example.blogApplication.services;

import com.example.blogApplication.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {
    //create
     CategoryDto createCategory(CategoryDto categoryDto);
    //update
     CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

    //delete
      void deleteCategory( Integer categoryId);

    //get
    List<CategoryDto> getAllCategory();
    //getOne
    CategoryDto getSingleCategory(Integer categoryId);
}
