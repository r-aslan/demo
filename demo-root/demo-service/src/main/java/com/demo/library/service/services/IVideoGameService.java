package com.demo.library.service.services;

import java.util.List;

import com.demo.library.service.beans.VideoGameBean;

public interface IVideoGameService {

	/**
	 * Get a VideoObject with a given id
	 * @param id id of a VideoGame
	 * @return VideoGame object if it can be found, <code>null</code> otherwise
	 */
	VideoGameBean getVideoGameById(int id);
	
	/**
	 * get all video games in a collection
	 * @return List of VideoGame
	 */
	List<VideoGameBean> getListVideoGame();
	
	void insertVideoGame(VideoGameBean videoGameBean);

	void updateVideoGame(VideoGameBean videoGameBean);
	void deleteVideoGame(VideoGameBean videoGameBean);
}
