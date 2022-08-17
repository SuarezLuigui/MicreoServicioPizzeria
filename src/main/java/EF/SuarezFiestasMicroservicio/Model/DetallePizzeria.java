package EF.SuarezFiestasMicroservicio.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="pizzeria_pizza")
public class DetallePizzeria {
	
	@Id
	private PizzeriaPizzaFK fk= new PizzeriaPizzaFK();

}
