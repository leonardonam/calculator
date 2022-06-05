package repos;

import org.springframework.data.jpa.repository.JpaRepository;

import nam.ejemplo.oautho.models.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
