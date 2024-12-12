package com.example.java_pandas.liblary.service;

import org.springframework.http.ResponseEntity;

public interface CrudInterface <RD, D>{
    public ResponseEntity<D> create(RD d);
    public ResponseEntity<D> read(Long id);
    public ResponseEntity<D> update(RD id);
    public boolean delete(Long id);

}
