package com.hackaboss.equipo4.Entity.Entities;

import com.hackaboss.equipo4.Entity.Component.Auditoria;

import javax.persistence.*;


@Entity
@Table(name = "objects")
public class Objects extends Auditoria {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "type_Id", nullable = false)
    private Type typeId;
    @OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private Persons personsId;
    @Column(name = " description", length = 150, nullable = false)
    private String description;
    @Column(name = "reasons", length = 50, nullable = false)
    private String reasons;
    @Column(name = "state", nullable = false)
    private Boolean state;

    public Type getTypeId() {
        return typeId;
    }

    public void setTypeId(Type typeId) {
        this.typeId = typeId;
    }

    public Persons getPersonsId() {
        return personsId;
    }

    public void setPersonsId(Persons personsId) {
        this.personsId = personsId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}




