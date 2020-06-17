package ec.gob.mag.schema.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.gob.mag.schema.domain.Inspectores;

@Repository("inspectoresRepository")
public interface InspectoresRepository extends CrudRepository<Inspectores, Long> {

}
