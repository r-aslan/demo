/**
 * 
 */
package com.demo.library.data.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author zo
 * Class representing media of music type
 */
@Entity(name = "MUSIQUE")
@DiscriminatorValue("MEDIA_MUSIQUE")
public class Music extends AbstractMedia{

	@Column(name = "INTERPRETE")
	private String interprete;

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}



}
