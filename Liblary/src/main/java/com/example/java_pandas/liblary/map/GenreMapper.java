package com.example.java_pandas.liblary.map;

import com.example.java_pandas.liblary.dto.GenreDto;
import com.example.java_pandas.liblary.entity.Genre;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenreMapper extends BaseMapper<GenreDto, Genre>{
}
