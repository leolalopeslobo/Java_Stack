package net.ems.springboot.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity  //to make this class a JPA entity
@Table(name="employees")   //to provide table details
public class Employee {

    @Id //to make it the primary key
    @GeneratedValue(strategy=GenerationType.IDENTITY)  //to provide primary key generation strategy
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_id")  //if you don't specify @Column annotation, then JPA gives the column name as the property name
    private String email;
}
