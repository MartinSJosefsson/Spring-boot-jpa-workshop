package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpaworkshop.entity.Details;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Integer> {
}
