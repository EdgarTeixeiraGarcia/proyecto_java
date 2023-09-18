package Entity.Entities;

import Entity.Components.GenericId;

import javax.persistence.*;

@Entity
@Table(name = "objects")
public class Objects extends GenericId {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_type", nullable = false)
    private String idType;
    @Column(name = " description", length = 150, nullable = false)
    private String description;
    @Column(name = "reason", length = 50, nullable = false)
    private String reason;
    @Column(name = "state", nullable = false)
    private Boolean state;

}
