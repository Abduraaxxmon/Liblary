package com.example.java_pandas.liblary.repository;
import com.example.java_pandas.liblary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);
}
