package com.hackaboss.equipo4.Entity.Component;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class Auditoria extends ActiveStatus {
    @Column(name = "create_date", nullable = false)
    private LocalDateTime createDate;

    @Column(name = "mod_date", nullable = true)
    private LocalDateTime modDate;

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getModDate() {
        return modDate;
    }

    public void setModDate(LocalDateTime modDate) {
        this.modDate = modDate;
    }
}