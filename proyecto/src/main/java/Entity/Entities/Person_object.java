package Entity.Entities;

import Entity.Components.GenericId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "person_object")
public class Person_object extends GenericId {

    @Column(name = "id_person")
    private String idPerson;
    @Column(name = "id_object")
    private String idObject;
    @Column(name = "time", nullable = false)
    private LocalDateTime time;
    @Column(name = "register_type", nullable = false)
    private Boolean registerType;
    @Column(name = "error", length = 250)
    private String error;
}
