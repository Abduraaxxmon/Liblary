package com.example.java_pandas.liblary.map;

import com.example.java_pandas.liblary.dto.LibrarianDto;
import com.example.java_pandas.liblary.entity.Librarian;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LibrarianMapper extends BaseMapper<LibrarianDto, Librarian> {
}
