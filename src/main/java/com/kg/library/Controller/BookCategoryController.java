package com.kg.library.Controller;

import java.util.List;

import javax.validation.Valid;

import com.kg.library.Repository.BookCategoryRepository;
// import com.kg.library.Repository.BookRepository;
import com.kg.library.model.Book;
import com.kg.library.model.BookCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Books")
public class BookCategoryController {
  
  @Autowired
  private BookCategoryRepository bookCategoryRepository;

  @GetMapping("/get")
  public @ResponseBody ResponseEntity<List<BookCategory>> all() {
      return new ResponseEntity<>(bookCategoryRepository.findAll(), HttpStatus.OK);
  }

  @PostMapping("/post")
  public ResponseEntity<?> post(@RequestBody BookCategory bookCategory) {
    bookCategoryRepository.save(bookCategory);
    //   HttpHeaders headers = new HttpHeaders();
    //   headers.setLocation(ucBuilder.path("/get/{id}").buildAndExpand(bookCategory.getBookcatId()).toUri());
      return new ResponseEntity<>(bookCategory, HttpStatus.CREATED);

  }

  @GetMapping("/get/{bookcatId}")
  public @ResponseBody ResponseEntity<?> getById(@PathVariable Long bookcatId) {

      BookCategory bookCategory = bookCategoryRepository.getOne(bookcatId);
      return new ResponseEntity<>(bookCategory, HttpStatus.OK);

  }

  @PutMapping("/put/{bookcatId}")
  public ResponseEntity<?> put(@PathVariable Long bookcatId, @RequestBody BookCategory bookCategory) {
    bookCategoryRepository.save(bookCategory);
      return new ResponseEntity<>(bookCategory, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{bookcatId}")
  public ResponseEntity<?> delete(@PathVariable Long bookcatId) {
      //Event currentevent = bookCategoryService.find(eventId);
      bookCategoryRepository.deleteById(bookcatId);
      return new ResponseEntity<>(HttpStatus.OK);
  }
}