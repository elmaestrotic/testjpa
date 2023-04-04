package com.narvasoft.testjpa.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Entity
@Table(name = "users")
@ToString
@EqualsAndHashCode
public class User  {
    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id")
    private Long id;
    @Getter
    @Setter
    @Column(name = "nombre")
    private String nombre;
    @Getter
    @Setter
    @Column(name = "apellido")
    private String apellido;
    @Getter
    @Setter
    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;
    @Getter
    @Setter
    @Column(name = "telefono")
    private String telefono;
    @Getter
    @Setter
    @Column(name = "password")
    private String password;
}