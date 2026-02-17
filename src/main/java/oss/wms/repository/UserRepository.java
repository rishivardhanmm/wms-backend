package oss.wms.repository;

import org.springframework.data.repository.CrudRepository;
import oss.wms.entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
