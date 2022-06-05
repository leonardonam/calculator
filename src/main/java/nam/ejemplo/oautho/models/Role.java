package nam.ejemplo.oautho.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements GrantedAuthority  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	private String name;


/*@ManyToMany(mappedBy = "roles")
private Set<User>users;
*/	
	
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return name;
	}

}
