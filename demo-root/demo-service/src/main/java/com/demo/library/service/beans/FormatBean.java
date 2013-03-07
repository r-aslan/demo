/**
 * 
 */
package com.demo.library.service.beans;

import java.util.List;


/**
 * @author zo
 *
 */
public class FormatBean {
	private int id;
	private String nom;
	private List<MusicBean> listMusic;
	private List<VideoGameBean> listVideoGame;
	private List<MovieBean> listMovie;
	
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
	public List<MusicBean> getListMusic() {
		return listMusic;
	}
	public void setListMusic(List<MusicBean> listMusic) {
		this.listMusic = listMusic;
	}
	public List<VideoGameBean> getListVideoGame() {
		return listVideoGame;
	}
	public void setListVideoGame(List<VideoGameBean> listVideoGame) {
		this.listVideoGame = listVideoGame;
	}
	public List<MovieBean> getListMovie() {
		return listMovie;
	}
	public void setListMovie(List<MovieBean> listMovie) {
		this.listMovie = listMovie;
	}
}
