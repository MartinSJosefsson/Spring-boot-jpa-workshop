package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpaworkshop.entity.Details;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Integer> {
    Optional<Details> findDetailsByEmail(String email);

    Collection<Details> findDetailsByName(String name);

    Collection<Details> findDetailsByNameIgnoreCase(String name);
}
