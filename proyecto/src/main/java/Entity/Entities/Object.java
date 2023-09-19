package Entity.Entities;

import DTO.ObjectDTO;
import Entity.Components.GenericId;

import javax.persistence.*;

@Entity
@Table(name = "objects")
public class Object extends GenericId {

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_type", nullable = false)
    private Long idType;
    @Column(name = " description", length = 150, nullable = false)
    private String description;
    @Column(name = "reason", length = 50, nullable = false)
    private String reason;

    @Column(name = "state", nullable = false)
    private Boolean state;

    public Long getIdType() {
        return idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public ObjectDTO toDTO() {
        return new ObjectDTO(this.getId(),this.getDescription(),this.getReason(),this.getState());
    }

}
