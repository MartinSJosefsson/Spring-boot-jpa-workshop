package se.lexicon.springbootjpaworkshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
public class BookLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Column(name = "book_loan_id", nullable = false, unique = true, updatable = false)
    private int id;

    @Getter
    @Setter
    @Column(nullable = false)
    private LocalDate loanDate;

    @Getter
    @Setter
    @Column(nullable = false)
    private LocalDate dueDate;

    @Getter
    @Setter
    @Column(nullable = false)
    private boolean returned;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "app_user_id")
    private AppUser borrower;

    @Getter
    @Setter
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;


}
