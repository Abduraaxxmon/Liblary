package com.example.java_pandas.liblary.service.impl;

import com.example.java_pandas.liblary.dto.AuthorDto;
import com.example.java_pandas.liblary.entity.Author;
import com.example.java_pandas.liblary.map.AuthorMapper;
import com.example.java_pandas.liblary.repository.AuthorRepository;
import com.example.java_pandas.liblary.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorMapper authorMapper;
    private final AuthorRepository authorRepository;

    @Override
    public ResponseEntity<AuthorDto> create(AuthorDto d) {
        return ResponseEntity
                .ok(authorMapper.toDto(authorRepository
                        .save(authorMapper.toEntity(d))));
    }

    @Override
    public ResponseEntity<AuthorDto> read(Long id) {
        return ResponseEntity.ok(
                authorMapper.toDto(authorRepository.getById(id))
        );
    }

    @Override
    public ResponseEntity<AuthorDto> update(AuthorDto id) {
        Author author = authorRepository.getByFirstName(id.getFirstName());
        author.setFirstName(author.getFirstName().toUpperCase());
        author.setLastName(author.getLastName().toUpperCase());

        return ResponseEntity.ok(authorMapper.toDto(authorRepository.save(author)));

    }

    @Override
    public boolean delete(Long id) {
        Optional<Author> author = authorRepository.findById(id);

        if (author.isPresent()) {
            authorRepository.delete(author.get());
            return true;
        }
        else{
            return true;
        }
    }
}