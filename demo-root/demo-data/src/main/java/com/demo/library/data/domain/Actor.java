/**
 * 
 */
package com.demo.library.data.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author zo
 * Class representing actors in a movie
 */
@Entity(name = "ACTEUR")
@Table(name = "ACTEUR")
public class Actor{


	@Id
	@Column(name = "ID_ACTEUR")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id ;

	@Column(name = "NOM_ACTEUR")
	private String nom;

	/*@Column(name = "PRENOM")
	private String prenom;*/
	
	@ManyToMany(mappedBy="casting", fetch=FetchType.EAGER)
	private List<Movie> movieList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
/*
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}*/

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		
		this.movieList = movieList;
	}
	
}
