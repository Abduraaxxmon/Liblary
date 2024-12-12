package com.example.java_pandas.liblary.controller;

import com.example.java_pandas.liblary.dto.BookDto;
import com.example.java_pandas.liblary.dto.GenreDto;
import com.example.java_pandas.liblary.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping
public class BookController {
    private final BookService service;

    @PostMapping
    public ResponseEntity<BookDto> create(@RequestBody BookDto dto){
        return service.create(dto);
    }

    @GetMapping
    public ResponseEntity<BookDto> read(@RequestParam Long id){
        return service.read(id);
    }
    @PostMapping
    public ResponseEntity<BookDto> update(@RequestBody BookDto dto){
        return service.update(dto);
    }
    @DeleteMapping
    public boolean delete(@RequestParam Long id){
        return service.delete(id);
    }
}
