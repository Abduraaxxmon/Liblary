package com.example.java_pandas.liblary.service.impl;

import com.example.java_pandas.liblary.dto.BookDto;
import com.example.java_pandas.liblary.entity.Book;
import com.example.java_pandas.liblary.map.BookMapper;
import com.example.java_pandas.liblary.repository.BookRepository;
import com.example.java_pandas.liblary.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class BookServiceImpl implements BookService {
    private final BookRepository repository;
    private final BookMapper mapper;
    @Override
    public ResponseEntity<BookDto> create(BookDto d) {
        return ResponseEntity.ok(mapper.toDto(repository
                .save(mapper.toEntity(d))));
    }

    @Override
    public ResponseEntity<BookDto> read(Long d) {
        return ResponseEntity.ok(mapper.toDto(repository.findById(d).get()));
    }

    @Override
    public ResponseEntity<BookDto> update(BookDto d) {
        Book book = repository.findByTitle(d.getTitle());
        book.setTitle(d.getTitle());
        book.setAuthor(d.getAuthor());
        book.setGenre(d.getGenre());
        book.setCount(d.getCount());

        return ResponseEntity.ok(mapper.toDto(repository.save(book)));
    }

    @Override
    public boolean delete(Long id) {
        Optional<Book> book = repository.findById(id);
        if (book.isPresent()) {
            repository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
