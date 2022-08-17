package EF.SuarezFiestasMicroservicio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EF.SuarezFiestasMicroservicio.Model.DetallePizzeria;


@Repository
public interface PizzeriaPizzaRepository extends JpaRepository<DetallePizzeria, Integer> {

}
