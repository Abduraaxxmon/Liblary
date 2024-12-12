package com.example.java_pandas.liblary.service.impl;

import com.example.java_pandas.liblary.dto.GenreDto;
import com.example.java_pandas.liblary.entity.Genre;
import com.example.java_pandas.liblary.map.GenreMapper;
import com.example.java_pandas.liblary.repository.GenreRepository;
import com.example.java_pandas.liblary.service.GenreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GenreInterfaceImpl implements GenreService {
    private final GenreRepository repository;
    private final GenreMapper mapper;
    @Override
    public ResponseEntity<GenreDto> create(GenreDto d) {

        return ResponseEntity
                .ok(mapper
                        .toDto(repository
                                .save(mapper.toEntity(d))));
    }

    @Override
    public ResponseEntity<GenreDto> read(Long d) {
        return ResponseEntity.ok(mapper.toDto(repository.getReferenceById(d)));
    }

    @Override
    public ResponseEntity<GenreDto> update(GenreDto d) {
        Genre genre = repository.getByGenre(d.getGenre());
        genre.setTitle(d.getGenre());

        return ResponseEntity.ok(mapper.toDto(repository.save(genre)));

    }

    @Override
    public boolean delete(Long id) {
        Optional<Genre> genre = repository.findById(id);
        if (genre.isPresent()){
            repository.deleteById(id);
            return true;
        }
        else {
        return false;
        }
    }
}
