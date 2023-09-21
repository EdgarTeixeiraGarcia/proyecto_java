package com.hackaboss.equipo4.DTO.Component;

import com.hackaboss.equipo4.Entity.Component.Auditoria;

public class ApiResponseDTO<T> extends Auditoria{

    private Boolean status;
    private String message;
    private T data;


    public ApiResponseDTO(String message, T data, Boolean status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {this.message = message;
    }
}