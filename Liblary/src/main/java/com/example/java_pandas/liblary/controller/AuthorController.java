package com.example.java_pandas.liblary.controller;

import com.example.java_pandas.liblary.dto.AuthorDto;
import com.example.java_pandas.liblary.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@AllArgsConstructor
public class AuthorController {
    private final AuthorService service;

    @PostMapping
    public ResponseEntity<AuthorDto> create(@RequestBody AuthorDto dto){
        return service.create(dto);
    }
    @GetMapping
    public ResponseEntity<AuthorDto> get(@RequestParam Long id){
        return service.read(id);
    }
    @PostMapping
    public ResponseEntity<AuthorDto> update(@RequestBody AuthorDto dto){
        return service.update(dto);
    }
    @DeleteMapping
    public boolean delete(@RequestParam Long id ){
        return service.delete(id);
    }
}
