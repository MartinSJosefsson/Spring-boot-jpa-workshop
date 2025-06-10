package se.lexicon.springbootjpaworkshop.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.springbootjpaworkshop.entity.AppUser;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

    @Query(value = "SELECT au FROM AppUser AS au WHERE au.username = :userName")
    AppUser findAppUserByUsername(@Param("userName") String userName);

}
