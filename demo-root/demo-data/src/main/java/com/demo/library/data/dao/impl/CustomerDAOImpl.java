/**
 * 
 */
package com.demo.library.data.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.demo.library.data.dao.ICustomerDAO;
import com.demo.library.data.domain.Customer;

/**
 * @author zo
 * Implementation of ICustomerDAO
 */
public class CustomerDAOImpl extends CrudDAOImpl<Customer> implements ICustomerDAO {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	//define a constructor 
	public CustomerDAOImpl() {
		super(Customer.class);
	}
/*
	public boolean debitAccount(Customer customer, int value) {
		int newCredit = customer.getCredit();
		newCredit -= value; 
		log.info("credit inside DAO = "+newCredit+"after substract "+value);
		if(newCredit >= 0){
			Customer c = findById(customer.getId());
			c.setCredit(newCredit);
			log.info("customer value "+c.getId()+" and "+c.getCredit());
			entityManager.merge(c);
			return true;
		}
		return false;
	}*/

}
