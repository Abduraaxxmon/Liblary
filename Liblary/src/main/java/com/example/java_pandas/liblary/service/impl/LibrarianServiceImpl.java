package com.example.java_pandas.liblary.service.impl;

import com.example.java_pandas.liblary.dto.LibrarianDto;
import com.example.java_pandas.liblary.entity.Librarian;
import com.example.java_pandas.liblary.map.LibrarianMapper;
import com.example.java_pandas.liblary.repository.LibrarianRepository;
import com.example.java_pandas.liblary.service.LibrarianService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor

public class LibrarianServiceImpl implements LibrarianService {
    private final LibrarianRepository repository;
    private final LibrarianMapper mapper;
    @Override
    public ResponseEntity<LibrarianDto> create(LibrarianDto d) {
        return ResponseEntity.ok(mapper.toDto(repository.save(mapper.toEntity(d))));
    }

    @Override
    public ResponseEntity<LibrarianDto> read(Long d) {
        Optional<Librarian> librarian = repository.findById(d);
        if(librarian.isPresent()){
            return ResponseEntity.ok(mapper.toDto(librarian.get()));
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<LibrarianDto> update(LibrarianDto d) {
        Optional<Librarian> librarianOptional = repository.findByUserName(d.getUsername());
        if(librarianOptional.isPresent()){
            Librarian librarian = librarianOptional.get();
            librarian.setPassword(d.getPassword());
            librarian.setUsername(d.getUsername());
            return ResponseEntity.ok(mapper.toDto(librarianOptional.get()));
        }
        return ResponseEntity.notFound().build();
        }

    @Override
    public boolean delete(Long d) {
        Optional<Librarian> librarianOptional = repository.findById(d);
        if(librarianOptional.isPresent()){
            repository.deleteById(d);
            return true;
        }
        return false;
    }
}
