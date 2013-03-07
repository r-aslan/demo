/**
 * 
 */
package com.demo.library.data.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.demo.library.data.dao.ICrudDAO;

/**
 * @author zo <br>
 * Generic DAO : generic data manipulation
 */
public  class CrudDAOImpl<T> implements ICrudDAO<T> {

	@PersistenceContext(unitName="jpa",  type = PersistenceContextType.EXTENDED)
	protected EntityManager entityManager;
	private Class<T> entity; 
	
	public CrudDAOImpl(Class<T> entity){
		this.entity = entity;
	}
	public	T findById(int id) {
		//T t = entityManager.find(entity, id);
		return entityManager.find(entity, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<T> findAll(){
		Query query = entityManager.createQuery("from " + entity.getName());
		//return entityManager.;
		return query.getResultList();
	}

	/**
	 * @inheritDoc
	 * Implementation of create using hibernate persist 
	 * @see com.ideoneov.movietheque.data.ICrudDAO#create(java.lang.Object)
	 */
	public void create(T t){
		entityManager.persist(t);
	}
	/** 
	 * @inheritDoc
	 * Implementation of update using hibernate merge 
	 * @see com.ideoneov.movietheque.data.ICrudDAO#update(java.lang.Object)
	 */
	public void update(T t) {
		entityManager.merge(t);
	}
	/** 
	 * @inheritDoc
	 * Implementation of delete using hibernate remove
	 * @see com.ideoneov.movietheque.data.ICrudDAO#delete(java.lang.Object)
	 */
	public void delete(T t) {
		entityManager.remove(t);
	}
	
}

