package com.example.java_pandas.liblary.controller;

import com.example.java_pandas.liblary.dto.LibrarianDto;
import com.example.java_pandas.liblary.dto.MemberShipManagementDto;
import com.example.java_pandas.liblary.service.MemberShipService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@AllArgsConstructor
public class MemberShipController {
    private final MemberShipService service;

    @PostMapping
    public ResponseEntity<MemberShipManagementDto> create(@RequestBody MemberShipManagementDto dto){
        return service.create(dto);
    }

    @GetMapping
    public ResponseEntity<MemberShipManagementDto> read(@RequestParam Long id){
        return service.read(id);
    }
    @PostMapping
    public ResponseEntity<MemberShipManagementDto> update(@RequestBody MemberShipManagementDto dto){
        return service.update(dto);
    }
    @DeleteMapping
    public boolean delete(@RequestParam Long id){
        return service.delete(id);
    }
}
