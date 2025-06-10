package se.lexicon.springbootjpaworkshop.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Details {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;

@Column(unique = true) //Makes name, email and birthdate unique
private String name;
private String email;
private LocalDate birthDate;
}
