package ec.gob.mag.scsemillasmicro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ec.gob.mag.scsemillasmicro.domain.Topografia;

@Repository
public interface TopografiaRepository extends CrudRepository<Topografia, Long> {

}
