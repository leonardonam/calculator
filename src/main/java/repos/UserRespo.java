package repos;

import org.springframework.data.jpa.repository.JpaRepository;

import nam.ejemplo.oautho.models.User;

public interface UserRespo extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
