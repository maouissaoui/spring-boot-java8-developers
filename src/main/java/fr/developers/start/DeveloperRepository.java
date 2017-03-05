package fr.developers.start;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DeveloperRepository extends CrudRepository<Developer, Long> {

	public List<Developer> findByCompetence(@Param("competence") String competence);
}

