package com.demo.library.data.dao.impl;

import com.demo.library.data.dao.IMovieDAO;
import com.demo.library.data.domain.Movie;

/**
 * @author zo
 *
 */
public class MovieDAOImpl extends MediaDAOImpl<Movie> implements IMovieDAO{

	public MovieDAOImpl() {
		super(Movie.class);
	}

	//existing actor in a new movie will have a detached state, only merge can reattach object to its persitence
	//context and it has the same behaviour as persist if object doesn't yet exist (obj with no persitent id)
	/**
	 * @inheritDoc
	 * Implementation of create method for Movie <br>
	 * Workaround solution to reattach detached entity<br>
	 * @see com.ideoneov.movietheque.data.impl.CrudDAOImpl#create(java.lang.Object)
	 */
	@Override 
	public void create(Movie movie) {
		entityManager.merge(movie);
	}
}