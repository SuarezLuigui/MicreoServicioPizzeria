package EF.SuarezFiestasMicroservicio.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import EF.SuarezFiestasMicroservicio.DTO.Pizza;

@FeignClient(name = "idat-pizza", url="localhost:8070")
public interface OpenFeignPizza {
	
	@GetMapping("/pizza/v1/listar")
	public List<Pizza> listarPizzasSeleccionados();

}