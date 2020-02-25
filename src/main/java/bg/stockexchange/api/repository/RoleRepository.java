package bg.stockexchange.api.repository;

import bg.stockexchange.api.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ITenev
 * created on 1/15/2020
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
