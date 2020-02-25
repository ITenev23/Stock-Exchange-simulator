package bg.stockexchange.api.repository;

import bg.stockexchange.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findFirstByEmail(String email);

    Optional<User> findFirstByUsername(String username);

    Optional<User> findFirstByEmailOrUsername(String email, String username);

}
