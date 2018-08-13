package com.example.SpringBootSample.service;

import java.util.List;

import com.example.SpringBootSample.model.BookCategory;

//import com.kgfsl.eventapp.Event;

public interface BookCategoryService {
    public List<BookCategory> getAll();
    public BookCategory save(BookCategory event);
    public BookCategory find(long id);
    public void delete(Long id);

}