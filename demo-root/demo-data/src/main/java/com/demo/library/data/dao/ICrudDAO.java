/**
 * 
 */
package com.demo.library.data.dao;

import java.util.List;

/**
 * @author zo
 *
 */
public interface ICrudDAO<T>{

	
	/**
	 * insert t into database
	 * @param t : entity object to be created
	 */
	void create(T t);
	/**
	 * Update existing entity values with current value
	 * @param t : entity object to be updated
	 */
	void update(T t);
	/**
	 * remove t from database
	 * @param t : entity to be removed
	 */
	void delete(T t);
	/**
	 * Find an object by id
	 * @param id : id of entity
	 * @return : object of entity type
	 */
	T findById(int id);
	/**
	 * get all values of T in database
	 * @return : List<T>
	 */
	List<T> findAll();
}
