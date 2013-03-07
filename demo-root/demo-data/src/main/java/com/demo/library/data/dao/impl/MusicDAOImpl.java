package com.demo.library.data.dao.impl;

import com.demo.library.data.dao.IMusicDAO;
import com.demo.library.data.domain.Music;

/**
 * @author zo
 * Implementation of IMusicDAO
 */
public class MusicDAOImpl extends MediaDAOImpl<Music> implements IMusicDAO {
	
	/**
	 * Constructor
	 */
	public MusicDAOImpl() {
		super(Music.class);
	}

}
