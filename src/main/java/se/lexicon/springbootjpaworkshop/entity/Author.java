package se.lexicon.springbootjpaworkshop.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false, name = "author_id")
    private int id;

    @Column(length = 50)
    private String firstName;

    @Column(length = 50)
    private String lastName;

    @ManyToMany
    @JoinTable(
            name = "author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<Book> books;


    public void addBook(Book book) {
        if (book == null) throw new IllegalArgumentException("Book cannot be null.");
        if (!this.books.contains(book)) {
            this.books.add(book);
            if (book.getAuthors() != null && !book.getAuthors().contains(this)) {
                book.addAuthor(this);
            }
        }
    }

    public void removeBook(Book book) {
        if (book == null) throw new IllegalArgumentException("Book cannot be null.");
        if (this.books.contains(book)) {
            this.books.remove(book);
            if (book.getAuthors() != null && book.getAuthors().contains(this)) {
                book.removeAuthor(this);
            }
        }
    }


}
