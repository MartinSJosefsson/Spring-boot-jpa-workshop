package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpaworkshop.entity.Author;

import java.util.List;
import java.util.Optional;


@Repository
public interface AuthorRepository extends CrudRepository<Author,Integer> {

    Optional<Author> findByFirstName (String firstName);
    Optional<Author> findByLastName (String lastName);

    @Query(value = "SELECT a FROM Author AS a WHERE a.firstName LIKE %:keyword% OR a.lastName LIKE %:keyword%")
    List<Author> findByFirstNameAndLastNameIsContaining(@Param("keyword") String keyword);


    @Query(value = "SELECT a FROM Author a JOIN a.books AS b WHERE b.id = :id")
            List<Author> findAuthorsByBook_Id(@Param("id") int id);


    @Query("update Author a set a.firstName = :updateName WHERE a.id = :author_id")
    @Modifying
    Optional<Author> updateAuthorById(@Param("author_id") int id, @Param("updateName") String updateName);


    Optional<Author> deleteAuthorsById(int id);




}
