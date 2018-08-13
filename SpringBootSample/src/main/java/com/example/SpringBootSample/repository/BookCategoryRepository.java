package com.example.SpringBootSample.repository;

import com.example.SpringBootSample.model.BookCategory;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * BookCategoryRepository
 */
public interface BookCategoryRepository extends JpaRepository<BookCategory,Long> {

    
}