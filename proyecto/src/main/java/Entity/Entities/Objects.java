package Entity.Entities;

import Entity.Components.GenericId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "objects")
public class Objects extends GenericId {

    @Column(name = "id_type", length = 50, nullable = false)
    private String idType;
    @Column(name = " description", length = 150, nullable = false)
    private String description;
    @Column(name = "reason", length = 50, nullable = false)
    private String reason;
    @Column(name = "state", nullable = false)
    private Boolean state;

}
