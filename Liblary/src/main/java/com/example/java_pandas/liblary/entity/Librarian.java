package com.example.java_pandas.liblary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String workTime;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "librarian_id")
    private MemberManagement memberManagement;

    public String getEmail() {
        return null;
    }
}
