package EF.SuarezFiestasMicroservicio.Service;

import java.util.List;

import EF.SuarezFiestasMicroservicio.Model.Pizzeria;

public interface PizzeriaService {
	

	List<Pizzeria> listar();
	Pizzeria ObtenerId(Integer id);	
	void guardar(Pizzeria pizzeria);
	void eliminar(Integer id);
	void actualizar(Pizzeria pizzeria);
	
	void asignarPizzaAPizzeria();


}
