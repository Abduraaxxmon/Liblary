package com.example.java_pandas.liblary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class MemberManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private Date membershipDate;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "memberManagement",fetch = FetchType.LAZY)
    private Librarian librarian;
}
