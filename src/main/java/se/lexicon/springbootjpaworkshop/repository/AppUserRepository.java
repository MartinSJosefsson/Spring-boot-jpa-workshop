package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.springbootjpaworkshop.entity.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, Integer> {
}
