package com.demo.library.service.beans;

import java.util.List;


public class MovieBean extends MediaBean {
	
	private String realisateur;
	private List<ActorBean> casting;


	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public List<ActorBean> getCasting() {
		return casting;
	}

	public void setCasting(List<ActorBean> casting) {
		this.casting = casting;
	}


}
