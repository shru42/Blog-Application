package com.example.blogApplication.controller;

import com.example.blogApplication.payloads.ApiResponse;
import com.example.blogApplication.payloads.CategoryDto;
import com.example.blogApplication.payloads.UserDto;
import com.example.blogApplication.services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("/")
    public ResponseEntity<CategoryDto> createCat(@Valid @RequestBody CategoryDto categoryDto){
        CategoryDto createCatDto=this.categoryService.createCategory(categoryDto);
        return new ResponseEntity<>(createCatDto, HttpStatus.CREATED);
    }
    @PutMapping("/{catId}")
    public ResponseEntity<CategoryDto> updateCat(@Valid @RequestBody CategoryDto categoryDto, @PathVariable Integer catId){
        CategoryDto updatedCategory=this.categoryService.updateCategory(categoryDto,catId);
        return new ResponseEntity<CategoryDto>(updatedCategory,HttpStatus.OK);
    }
    @DeleteMapping("{catId}")
    public ResponseEntity<ApiResponse> deleteCat(@PathVariable Integer catId){
        this.categoryService.deleteCategory(catId);
        return  new ResponseEntity(new ApiResponse("Category deleted sucessfully",true),HttpStatus.OK);
    }

    @GetMapping("/")
    public  ResponseEntity<List<CategoryDto>> getAllCats(){
        List<CategoryDto> categories=this.categoryService.getAllCategory();
        return ResponseEntity.ok(categories);
    }
    @GetMapping("/{catId}")
    public  ResponseEntity<CategoryDto> getSingleUser(@PathVariable Integer catId){
        return  ResponseEntity.ok(this.categoryService.getSingleCategory(catId));
    }

}
