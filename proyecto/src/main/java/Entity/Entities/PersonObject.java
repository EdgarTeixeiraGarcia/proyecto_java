package Entity.Entities;

import Entity.Components.GenericId;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "person_object")
public class PersonObject extends GenericId {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_person", nullable = false)
    private Long idPerson;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_object", nullable = false)
    private Long idObject;
    @Column(name = "time", nullable = false)
    private LocalDateTime time;
    @Column(name = "register_type", nullable = false)
    private Boolean registerType;
    @Column(name = "error")
    private Boolean error;

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public Long getIdObject() {
        return idObject;
    }

    public void setIdObject(Long idObject) {
        this.idObject = idObject;
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
