package com.example.java_pandas.liblary.map;

import com.example.java_pandas.liblary.dto.AuthorDto;
import com.example.java_pandas.liblary.entity.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper extends BaseMapper<AuthorDto, Author> {
}
