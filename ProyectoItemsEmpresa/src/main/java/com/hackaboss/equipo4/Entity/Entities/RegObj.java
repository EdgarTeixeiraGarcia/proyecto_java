package com.hackaboss.equipo4.Entity.Entities;

import com.hackaboss.equipo4.Entity.Component.Auditoria;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "RegObj")
public class RegObj extends Auditoria {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_Id", nullable = false)
    private Persons PersonId;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "object_id", nullable = false)
    private Objects ObjectsId;
    @Column(name = "time", nullable = false)
    private LocalDateTime time;
    @Column(name = "register_type", nullable = false)
    private Boolean registerType;
    @Column(name = "error")
    private Boolean error;

    public Persons getPersonId() {
        return PersonId;
    }

    public void setPersonId(Persons personId) {
        PersonId = personId;
    }

    public Objects getObjectsId() {
        return ObjectsId;
    }

    public void setObjectsId(Objects objectsId) {
        ObjectsId = objectsId;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getRegisterType() {
        return registerType;
    }

    public void setRegisterType(Boolean registerType) {
        this.registerType = registerType;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
