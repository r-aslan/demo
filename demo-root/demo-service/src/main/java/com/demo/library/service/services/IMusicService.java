package com.demo.library.service.services;

import java.util.List;

import com.demo.library.service.beans.MusicBean;

public interface IMusicService  extends IMediaService{

	
	/**
	 * @param id id for a given CD
	 * @return a CD object if an object is found ,<code>null</code> otherwise
	 */
	MusicBean getMusicById(int id);
	
	List<MusicBean> getListMusic();
	void insertMusic(MusicBean musicBean);
	void updateMusic(MusicBean musicBean);
	void deleteMusic(MusicBean musicBean);
}
