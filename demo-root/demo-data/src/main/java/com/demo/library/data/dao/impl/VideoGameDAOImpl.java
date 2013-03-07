package com.demo.library.data.dao.impl;

import com.demo.library.data.dao.IVideoGameDAO;
import com.demo.library.data.domain.VideoGame;

/**
 * @author zo
 * Implementation of IVideoGameDAO
 */
public class VideoGameDAOImpl extends MediaDAOImpl<VideoGame> implements IVideoGameDAO {

	public VideoGameDAOImpl() {
		super(VideoGame.class);
	}


}
