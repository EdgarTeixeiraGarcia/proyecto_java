package Entity.Entities;

import Entity.Components.GenericId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
public class Persons extends GenericId {

    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = " first_surname", length = 50, nullable = false)
    private String firstSurname;
    @Column(name = "second_surname", length = 50, nullable = false)
    private String secondSurname;
    @Column(name = "dni", length = 9, nullable = false)
    private String dni;
    @Column(name = "phone", length = 20, nullable = false)
    private String phone;
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    @Column(name = "employee",nullable = false)
    private Boolean employee;
}
