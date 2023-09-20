package com.hackaboss.equipo4.DTO.Entities;


import com.hackaboss.equipo4.DTO.Component.IGenericDTO;

public interface IPersonsDTO extends IGenericDTO {
    String getName();
    String getFirstSurname();
    String getSecondSurname();
    String getDni();
    String getPhone();
    String getEmail();
    Boolean getEmployee();
}
