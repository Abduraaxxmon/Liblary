package com.example.java_pandas.liblary.map;

import java.util.List;

public interface BaseMapper <D,E>{
    public D toDto(E e);
    public E toEntity(D d);
    public List<E> toEntityList(List<D> ds);
    public List<D> toDtoList(List<E> es);
}
