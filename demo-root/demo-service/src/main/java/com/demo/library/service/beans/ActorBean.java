/**
 * 
 */
package com.demo.library.service.beans;

import java.util.List;


/**
 * @author zo
 *
 */
public class ActorBean {

	private int id;

	private String nom;
	//private String prenom;
	private List<MovieBean> movieList;

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

/*	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}*/

	public List<MovieBean> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<MovieBean> movieList) {
		this.movieList = movieList;
	}
}
