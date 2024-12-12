package com.example.java_pandas.liblary.controller;

import com.example.java_pandas.liblary.dto.GenreDto;
import com.example.java_pandas.liblary.dto.LibrarianDto;
import com.example.java_pandas.liblary.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping
public class GenreController {
    private final GenreService service;

    @PostMapping
    public ResponseEntity<GenreDto> create(@RequestBody GenreDto dto){
        return service.create(dto);
    }

    @GetMapping
    public ResponseEntity<GenreDto> read(@RequestParam Long id){
        return service.read(id);
    }
    @PostMapping
    public ResponseEntity<GenreDto> update(@RequestBody GenreDto dto){
        return service.update(dto);
    }
    @DeleteMapping
    public boolean delete(@RequestParam Long id){
        return service.delete(id);
    }

}
