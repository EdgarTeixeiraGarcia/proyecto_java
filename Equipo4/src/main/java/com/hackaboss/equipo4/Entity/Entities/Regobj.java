package com.hackaboss.equipo4.Entity.Entities;

import com.hackaboss.equipo4.Entity.Component.Auditoria;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Regobj")
public class Regobj extends Auditoria {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persons_id", nullable = false)
    private Persons personsId;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "object_id", nullable = false)
    private Objects objectsId;
    @Column(name = "time", nullable = false)
    private LocalDateTime time;
    @Column(name = "register_type", nullable = false)
    private Boolean registerType;
    @Column(name = "error")
    private Boolean error;

    public Persons getPersonsId() {
        return personsId;
    }

    public void setPersonsId(Persons personsId) {
        this.personsId = personsId;
    }

    public Objects getObjectsId() {
        return objectsId;
    }

    public void setObjectsId(Objects objectsId) {
        this.objectsId = objectsId;
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
