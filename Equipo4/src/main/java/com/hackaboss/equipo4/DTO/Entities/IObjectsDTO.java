package com.hackaboss.equipo4.DTO.Entities;

import com.hackaboss.equipo4.DTO.Component.IGenericDTO;

public interface IObjectsDTO extends IGenericDTO {
    Long getTypeId();
    Long getPersonsId();
    String getDescription();
    String getReasons();
    String getState();

}
