package com.example.java_pandas.liblary.map;

import com.example.java_pandas.liblary.dto.MemberShipManagementDto;
import com.example.java_pandas.liblary.entity.MemberManagement;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MemberShipMapper extends BaseMapper<MemberShipManagementDto, MemberManagement> {
}
