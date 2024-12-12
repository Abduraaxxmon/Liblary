package com.example.java_pandas.liblary.dto;

import com.example.java_pandas.liblary.entity.Librarian;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberShipManagementDto {
    private String name;
    private String email;
    private String phone;
    private Date membershipDate;
    private Librarian librarian;
}
