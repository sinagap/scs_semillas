package ec.gob.mag.schema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import ec.gob.mag.schema.domain.Inspectores;
import ec.gob.mag.schema.repository.InspectoresRepository;

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
