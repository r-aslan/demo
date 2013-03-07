/**
 * 
 */
package com.demo.libraryd.data.domain;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;



/**
 * @author zo
 * Class representing Media of movie type
 */
@Entity(name = "FILM")
@DiscriminatorValue("MEDIA_FILM")
public class Movie extends AbstractMedia{


	@Column(name = "REALISATEUR")
	private String realisateur;

	@ManyToMany(cascade={CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST})
	@JoinTable(name = "LIEN_FILM_ACTEUR", joinColumns = { @JoinColumn(name = "ID_FILM") }, inverseJoinColumns = { @JoinColumn(name = "ID_ACTEUR") })
	private List<Actor> casting;

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public List<Actor> getCasting() {
		return casting;
	}

	public void setCasting(List<Actor> casting) {
		this.casting = casting;
	}
	
	
	//another useless code
/*	@Override
	public boolean equals(Object obj){
		if (obj instanceof Movie) {
	        return ((Movie)obj).getTitre ().equals (getTitre());
	    }
	    return false;

		
	}
	
	@Override
	public int hashCode(){
		return ((getTitre()==null) ? 0 : getTitre().hashCode()); 
		
	}*/
	
}
