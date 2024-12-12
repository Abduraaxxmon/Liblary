package com.example.java_pandas.liblary.service.impl;

import com.example.java_pandas.liblary.config.OpenApiConfig;
import com.example.java_pandas.liblary.dto.MemberShipManagementDto;
import com.example.java_pandas.liblary.entity.MemberManagement;
import com.example.java_pandas.liblary.map.MemberShipMapper;
import com.example.java_pandas.liblary.repository.MemberShipRepository;
import com.example.java_pandas.liblary.service.MemberShipService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MemberShipServiceImpl implements MemberShipService {
    private final MemberShipRepository repository;
    private final MemberShipMapper mapper;

    @Override
    public ResponseEntity<MemberShipManagementDto> create(MemberShipManagementDto d) {
        return ResponseEntity.ok(mapper.toDto(repository.save(mapper.toEntity(d))));
    }

    @Override
    public ResponseEntity<MemberShipManagementDto> read(Long d) {
        Optional<MemberManagement> optionalMemberManagement = repository.findById(d);
        if (optionalMemberManagement.isPresent()){
            MemberManagement memShip = optionalMemberManagement.get();

            return ResponseEntity.ok(mapper.toDto(memShip));
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public ResponseEntity<MemberShipManagementDto> update(MemberShipManagementDto d) {
        Optional<MemberManagement> optionalMemberManagement = repository.findByEmail(d.getEmail());

        if (optionalMemberManagement.isPresent()){
            MemberManagement memShip = optionalMemberManagement.get();
            memShip.setEmail(d.getEmail());
            memShip.setName(d.getName());
            memShip.setLibrarian(d.getLibrarian());
            memShip.setPhoneNumber(d.getPhone());

            return ResponseEntity.ok(mapper.toDto(memShip));
        }
        return ResponseEntity.notFound().build();
    }

    @Override
    public boolean delete(Long id) {
        Optional<MemberManagement> optionalMemberManagement = repository.findById(id);
        if (optionalMemberManagement.isPresent()){
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
