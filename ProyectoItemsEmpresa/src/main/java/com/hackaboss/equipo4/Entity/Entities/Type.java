package com.hackaboss.equipo4.Entity.Entities;

import com.hackaboss.equipo4.Entity.Component.Auditoria;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "type")
public class Type extends Auditoria {

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
