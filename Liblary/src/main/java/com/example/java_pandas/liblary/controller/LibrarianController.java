package com.example.java_pandas.liblary.controller;

import com.example.java_pandas.liblary.dto.LibrarianDto;
import com.example.java_pandas.liblary.service.LibrarianService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@AllArgsConstructor

public class LibrarianController {

    private final LibrarianService service;

    @PostMapping
    public ResponseEntity<LibrarianDto> create(@RequestBody LibrarianDto dto){
        return service.create(dto);
    }

    @GetMapping
    public ResponseEntity<LibrarianDto> read(@RequestParam Long id){
        return service.read(id);
    }
    @PostMapping
    public ResponseEntity<LibrarianDto> update(@RequestBody LibrarianDto dto){
        return service.update(dto);
    }
    @DeleteMapping
    public boolean delete(@RequestParam Long id){
        return service.delete(id);
    }
}
