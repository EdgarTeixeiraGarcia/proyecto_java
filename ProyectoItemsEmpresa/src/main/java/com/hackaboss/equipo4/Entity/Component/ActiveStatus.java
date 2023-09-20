package com.hackaboss.equipo4.Entity.Component;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ActiveStatus extends Generic {
    @Column(name = "active", nullable = false)
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
