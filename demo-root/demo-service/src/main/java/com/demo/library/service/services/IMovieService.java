package com.demo.library.service.services;

import java.util.List;

import com.demo.library.service.beans.MovieBean;

public interface IMovieService{

	/**
	 * get all movies in a collection
	 * @return collection of Movie object
	 */
	//Map<Integer,Movie> getMapMovie();
	/**
	 * @param id id of a given movie
	 * @return a Movie object if a Movie is found, <code>null</code> otherwise
	 */
	MovieBean getMovieById(int id);
	
	
	/**
	 * @return List of Movie 
	 */
	List<MovieBean> getListMovie();
	
	void insertMovie(MovieBean movieBean);
	void updateMovie(MovieBean movieBean);
	void deleteMovie(MovieBean movieBean);
}
