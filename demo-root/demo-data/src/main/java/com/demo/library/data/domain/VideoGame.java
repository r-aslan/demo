package com.demo.library.data.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author zo
 * Media of type videogame
 */
@Entity(name = "JEU")
@DiscriminatorValue("MEDIA_JEU_VIDEO")
public class VideoGame extends AbstractMedia{

	@Column(name = "TYPE_JEU")
	private String typeJeu;

	public String getTypeJeu() {
		return typeJeu;
	}

	public void setTypeJeu(String typeJeu) {
		this.typeJeu = typeJeu;
	}



}
