package ec.gob.mag.scsemillasmicro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import ec.gob.mag.scsemillasmicro.domain.Inspectores;
import ec.gob.mag.scsemillasmicro.repository.InspectoresRepository;

@Service("inspectoresService")
public class InspectoresService {
	
	@Autowired
	@Qualifier("inspectoresRepository")
	private InspectoresRepository inspectorRepo;
	
	@Autowired
	private MessageSource messageSource;
	
	public List<Inspectores> findAll(){
		List<Inspectores> inspector = (List<Inspectores>) inspectorRepo.findAll();
		return inspector;
	}

}
