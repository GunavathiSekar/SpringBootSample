package com.kg.library.Repository;

import javax.validation.Valid;

import com.kg.library.model.Book;
import com.kg.library.model.BookCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{




}