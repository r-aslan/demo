/**
 * 
 */
package com.demo.library.data.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.library.data.dao.IAbstractMediaDAO;
import com.demo.library.data.domain.AbstractMedia;
import com.demo.library.data.domain.Customer;

/**
 * @author zo
 *
 */
public class AbstractMediaDAOImpl extends MediaDAOImpl<AbstractMedia> implements IAbstractMediaDAO {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	public AbstractMediaDAOImpl() {
		super(AbstractMedia.class);
	}

	public void BorrowAMedia(AbstractMedia abstractMedia) {
		entityManager.merge(abstractMedia);
	}

	public void updateMediaCustomers(int id, Customer customer) {
		Query query = entityManager.createNamedQuery("updateMediaCustomers").setParameter("id", id).setParameter("customer", customer);
		query.executeUpdate();
	}

	public void updateListOfMedias(List<Integer> idList, Customer customer) {
		Query query = entityManager.createNamedQuery("updateListOfMedias").setParameter("idList", idList).setParameter("customer", customer);
		query.executeUpdate();
	}

	public List getMediasByCustomer(Customer customer) {
		Query query = entityManager.createNamedQuery("getMediasByCustomer").setParameter("customer", customer);
		return query.getResultList();
	}
	
	
}
