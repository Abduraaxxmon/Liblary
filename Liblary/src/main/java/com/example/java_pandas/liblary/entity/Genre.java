package com.example.java_pandas.liblary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false,unique = true)
    private String title;

    @OneToMany(mappedBy = "genre",cascade = CascadeType.ALL)
    private Set<Book> books = new HashSet<Book>();
}
