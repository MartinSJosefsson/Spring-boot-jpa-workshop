package se.lexicon.springbootjpaworkshop.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity //Turning it into an entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, name = "app_user_id")
    private int id;

    @Column(unique = true, length = 100)
    private String username;
    @Column(nullable = false, length = 100)
    private String password;
    private LocalDate regDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Details userDetails;

}

