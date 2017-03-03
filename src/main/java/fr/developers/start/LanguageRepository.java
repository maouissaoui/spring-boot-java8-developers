package fr.developers.start;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LanguageRepository extends CrudRepository<Language, Long> {

}