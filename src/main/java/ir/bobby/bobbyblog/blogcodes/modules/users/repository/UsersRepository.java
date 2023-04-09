package ir.bobby.bobbyblog.blogcodes.modules.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ir.bobby.bobbyblog.blogcodes.modules.users.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByEmail(String email);

    @Query("select u from Users u where u.email=:email")
    Users findByQuery(@Param("email") String email);

}
