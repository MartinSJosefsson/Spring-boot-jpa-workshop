package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpaworkshop.entity.BookLoan;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookLoanRepository extends CrudRepository<BookLoan, Integer> {
    Optional<BookLoan> findBookLoanByBook_Id(Integer bookLoanId);
    Optional<BookLoan> findBookLoanByBorrower_Id(Integer bookLoanId);
    List<BookLoan> findBookLoansByReturned(boolean returned);
    List<BookLoan> findBookLoansByDueDateIsAfter(LocalDate dueDateAfter);
    List <BookLoan> findBookLoansByLoanDateBetween (LocalDate loanDate,LocalDate dueDate);

    @Modifying
    @Query(value = "UPDATE BookLoan AS bl set bl.returned = false WHERE bl.id = :bookLoanId")
    Optional<BookLoan> markBookLoanFalseById(@Param("bookLoanId") int bookLoanId);
}
