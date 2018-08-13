package com.example.SpringBootSample.service;

import java.util.List;
import java.util.Optional;

import com.example.SpringBootSample.model.BookCategory;
import com.example.SpringBootSample.repository.BookCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import com.kgfsl.eventapp.Event;
// import com.kgfsl.eventapp.EventRepository;
// import com.kgfsl.eventapp.EventService;

@Service
public class BookCategoryServiceImp implements BookCategoryService {

    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    @Override
    public List<BookCategory> getAll() {
        // TODO Auto-generated method stub
        //System.out.println(bookCategoryRepository.findAll());
        return bookCategoryRepository.findAll();
    }

    @Override
    public BookCategory save(BookCategory bookCategory) {
        // TODO Auto-generated method stub
        return bookCategoryRepository.saveAndFlush(bookCategory);

    }

    @Override
    public BookCategory find(long id) {
        // TODO Auto-generated method stub
       // System.out.println(bookCategoryRepository.findOne(id));
        return bookCategoryRepository.getOne(id);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        bookCategoryRepository.deleteById(id);
    }

}