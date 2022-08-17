package EF.SuarezFiestasMicroservicio.DTO;

import lombok.Data;

@Data
public class Pizza {
	
	private Integer idPizza;
	private String nombrePizza;
	private String descripcion;
	
	
	public Integer getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}
	
	

}
