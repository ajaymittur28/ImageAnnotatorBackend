package dev.cse.imageannotatorbackend.repository;

import dev.cse.imageannotatorbackend.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
	@Query(value = "SELECT * FROM Users WHERE Username = ?", nativeQuery = true)
	Optional<Users> findByUsername(String username);
}
