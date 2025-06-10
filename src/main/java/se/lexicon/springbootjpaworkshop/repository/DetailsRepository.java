package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.springbootjpaworkshop.entity.Details;

public interface DetailsRepository extends CrudRepository<Details, Integer> {
}
