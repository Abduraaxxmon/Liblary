package com.example.java_pandas.liblary.dto;

import com.example.java_pandas.liblary.entity.Author;
import com.example.java_pandas.liblary.entity.Genre;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDto {
    private String title;
    private Author author;
    private Long count;
    private Genre genre;
}
