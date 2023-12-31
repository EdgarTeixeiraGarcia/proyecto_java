package Entity.Entities;

import DTO.PersonObjectDTO;
import DTO.TypeOfObjectDTO;
import Entity.Components.GenericId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "type_of_object")
public class TypeOfObject extends GenericId {

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfObjectDTO toDTO() {
        return new TypeOfObjectDTO(
                this.getId(),
                this.getName());
    }
}
