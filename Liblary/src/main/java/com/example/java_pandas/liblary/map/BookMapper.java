package com.example.java_pandas.liblary.map;

import com.example.java_pandas.liblary.dto.BookDto;
import com.example.java_pandas.liblary.entity.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper extends BaseMapper<BookDto, Book>{
}
