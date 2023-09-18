package Entity.Entities;

import Entity.Components.GenericId;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "person_object")
public class PersonObject extends GenericId {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_person", nullable = false)
    private String idPerson;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_object", nullable = false)
    private String idObject;
    @Column(name = "time", nullable = false)
    private LocalDateTime time;
    @Column(name = "register_type", nullable = false)
    private Boolean registerType;
    @Column(name = "error", length = 250)
    private String error;
}
