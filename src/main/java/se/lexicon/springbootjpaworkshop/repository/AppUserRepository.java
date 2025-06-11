package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpaworkshop.entity.AppUser;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

    Optional<AppUser> findAppUserByUsername(String username);
    Optional<AppUser> findAppUserByUserDetails_Id(Integer id);
    Collection<AppUser> findAppUserByRegDateBetween(LocalDate regDateAfter, LocalDate regDateBefore);
    Optional<AppUser> findAppUsersByUserDetails_Email(String userDetailsEmail);


}
