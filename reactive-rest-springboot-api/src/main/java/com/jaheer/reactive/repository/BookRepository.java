package com.jaheer.reactive.repository;

import com.jaheer.reactive.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    List<Book> findAllByAuthorId(String authorId);
}
