package com.hackaboss.equipo4.DTO.Entities;


import com.hackaboss.equipo4.DTO.Component.IGenericDTO;

public interface IRegObjDTO extends IGenericDTO {
    Long getPersonId();
    String getObjectId();
    String getTime();
    Boolean getRegisterType();
    Boolean getError();
}
