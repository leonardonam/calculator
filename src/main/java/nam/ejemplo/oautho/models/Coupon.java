package nam.ejemplo.oautho.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;
	 private String code;
	 private BigDecimal discount;
	 private String expDate;
}
