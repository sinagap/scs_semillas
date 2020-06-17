package ec.gob.mag.scsemillasmicro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.gob.mag.scsemillasmicro.domain.Inspectores;

@Repository("inspectoresRepository")
public interface InspectoresRepository extends CrudRepository<Inspectores, Long> {

}
