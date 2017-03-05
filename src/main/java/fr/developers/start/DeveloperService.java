package fr.developers.start;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperService {

	private DeveloperRepository repository;
	
	public DeveloperService(){
		
	}

	@Autowired
	public DeveloperService(DeveloperRepository repository) {
		this.repository = repository;
	}

	public List<Developer> findByCompetence(String competence) {
		List<Developer> developers = null;
		try {
			developers = (List<Developer>) repository.findAll();
			developers.stream()
					// filtrage
					.filter(dev -> dev.getLangage().getNiveauCompetence().equals("good"))
					//.map(dev -> dev.getLangage().getNiveauCompetence().equals("good") )
					.collect(Collectors.toList());

		} catch (Exception e) {

		}

		return developers;
	}

}