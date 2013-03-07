/**
 * 
 */
package com.demo.library.data.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.library.data.dao.IMediaDAO;
import com.demo.library.data.domain.AbstractMedia;

/**
 * @author zo
 * 
 */
public class MediaDAOImpl<T extends AbstractMedia> extends CrudDAOImpl<T> implements IMediaDAO<T> {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	public MediaDAOImpl(Class<T> entity) {
		super(entity);
	}

	@SuppressWarnings("unchecked")
	public List getAvailableMedia() {
		log.info("querying database to retrieve all medias avalaible");
		Query query = entityManager.createNamedQuery("getAvailableMedias");
				//.setParameter("customer", null);
		return query.getResultList();
	}

}
