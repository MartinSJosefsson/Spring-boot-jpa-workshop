package se.lexicon.springbootjpaworkshop.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Details {

@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private int id;

@Column(unique = true) //Makes name, email and birthdate unique
private String name;
private String email;
private LocalDate birthDate;

public Details() {

}

public Details(String name, String email, LocalDate birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
}
}
