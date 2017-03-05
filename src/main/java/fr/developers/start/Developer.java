/**
 * 
 */
package fr.developers.start;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * The Developer entity.
 * 
 * @author  Moufida Aouissaoui
 *
 */
@Entity
public class Developer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String competence;
	@OneToOne
	private Language langage;

	public Developer() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Language getLangage() {
		return langage;
	}

	public void setLangage(Language langage) {
		this.langage = langage;
	}

	public String getCompetence() {
		return competence;
	}

	public void setCompetence(String competence) {
		this.competence = competence;
	}
	
	
 

}