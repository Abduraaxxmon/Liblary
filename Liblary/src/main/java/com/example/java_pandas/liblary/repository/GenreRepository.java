package com.example.java_pandas.liblary.repository;

import com.example.java_pandas.liblary.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
    Genre getByGenre(String genre);
}

