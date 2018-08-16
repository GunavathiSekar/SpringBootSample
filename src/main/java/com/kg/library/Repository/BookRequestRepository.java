package com.kg.library.Repository;

import java.util.List;

import com.kg.library.model.BookRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRequestRepository extends JpaRepository<BookRequest, Long>{
    public List<BookRequest> findByUserid(Long userid);
}