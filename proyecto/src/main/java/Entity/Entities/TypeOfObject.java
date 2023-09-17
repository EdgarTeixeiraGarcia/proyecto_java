package Entity.Entities;

import Entity.Components.GenericId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "type_of_object")
public class TypeOfObject extends GenericId {

    @Column(name = "name", length = 50, nullable = false)
    private String name;
}
