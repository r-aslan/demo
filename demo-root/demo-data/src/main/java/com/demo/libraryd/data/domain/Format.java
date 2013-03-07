/**
 * 
 */
package com.demo.libraryd.data.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
/**
 * @author zo
 * Class representing available format of media 
 */
@Entity(name="FORMAT") @Table(name="FORMAT")
public class Format {
	
	@Id @Column(name="ID")
	private int id;
	
	@Column(name="NOM")
	private String nom;
	
	@Transient
	@OneToMany(mappedBy="format", fetch=FetchType.LAZY)
	private List<Music> listMusic;
	
	@Transient
	@OneToMany(mappedBy="format")
	private List<VideoGame> listVideoGame;
	
	@Transient
	@OneToMany(mappedBy="format")
	private List<Movie> listMovie;
	
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
	public List<Music> getListMusic() {
		return listMusic;
	}
	public void setListMusic(List<Music> listMusic) {
		this.listMusic = listMusic;
	}
	public List<VideoGame> getListVideoGame() {
		return listVideoGame;
	}
	public void setListVideoGame(List<VideoGame> listVideoGame) {
		this.listVideoGame = listVideoGame;
	}
	public List<Movie> getListMovie() {
		return listMovie;
	}
	public void setListMovie(List<Movie> listMovie) {
		this.listMovie = listMovie;
	}
	

}
