package se.lexicon.springbootjpaworkshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class Book {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, name = "book_id", nullable = false, updatable = false)
    private int id;

    @Getter
    @Column (nullable = false, unique = true)
    private String isbn;

    @Getter
    @Setter
    @Column(nullable = false)
    private String title;

    @Getter
    @Setter
    @Column(nullable = false)
    private int maxLoanDays;

    @ManyToMany(mappedBy = "books") //Indicats that it's the author who is the owning side
    private List<Author> authors;


    public Book(String isbn, String title, int maxLoanDays) {
        this.isbn = isbn;
        this.title = title;
        this.maxLoanDays = maxLoanDays;

    }

    @PrePersist
    private void onCreation() {this.isbn = String.valueOf(UUID.randomUUID());}


}

