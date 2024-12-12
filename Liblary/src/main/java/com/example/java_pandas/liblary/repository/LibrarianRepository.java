package com.example.java_pandas.liblary.repository;

import com.example.java_pandas.liblary.entity.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LibrarianRepository extends JpaRepository<Librarian,Long> {
    Optional<Librarian> findByUserName(String username);

    Optional<Librarian> findByEmail(String username);

}
