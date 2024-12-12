package com.example.java_pandas.liblary.repository;

import com.example.java_pandas.liblary.entity.MemberManagement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberShipRepository extends JpaRepository<MemberManagement,Long> {
    Optional<MemberManagement> findByEmail(String email);
}
