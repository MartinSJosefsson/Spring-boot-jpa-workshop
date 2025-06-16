package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpaworkshop.entity.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
    Optional<Book> findBooksByIsbnIgnoreCase(String isbn);
    Optional<Book> findBooksByTitleContains(String title);
    List<Book> findBooksByMaxLoanDays(int maxLoanDays);



}
