package fr.developers.start;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The Language entity.
 * 
 * @author  Moufida Aouissaoui
 *
 */
@Entity
public class Language {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public String name;
	public String niveauCompetence;

	public Language() {

	}

	public Language(String name, String niveauCompetence) {
		this.name = name;
		this.niveauCompetence = niveauCompetence;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNiveauCompetence() {
		return niveauCompetence;
	}

	public void setNiveauCompetence(String niveauCompetence) {
		this.niveauCompetence = niveauCompetence;
	}

}
