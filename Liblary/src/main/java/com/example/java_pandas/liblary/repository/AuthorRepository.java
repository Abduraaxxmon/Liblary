package com.example.java_pandas.liblary.repository;

import com.example.java_pandas.liblary.dto.AuthorDto;
import com.example.java_pandas.liblary.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author getReferenceById(Long d);

    Author getByFirstName(String firstName);
}


