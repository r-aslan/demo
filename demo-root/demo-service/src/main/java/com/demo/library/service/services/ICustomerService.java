/**
 * 
 */
package com.demo.library.service.services;

import java.util.List;

import com.demo.library.service.beans.CustomerBean;

/**
 * @author zo
 *
 */
public interface ICustomerService {

	CustomerBean getCustomerById(int id);
	/**
	 * list all available customers
	 * @return : List<Customer>
	 */
	List<CustomerBean> getAllCustomers();
	void insertCustomer(CustomerBean customerBean);
	void updateCustomer(CustomerBean customerBean);
	/**
	 * @param value : value to substract from customer credit
	 */
	//boolean debitAccount(CustomerBean customerBean);
	void debitAccount(CustomerBean customerBean, int value);
	//boolean saveDebitAccount(CustomerBean customerBean);
	/**
	 * credit customer accounter with current value
	 * @param value : value to add
	 */
	void creditAccount(CustomerBean customerBean, int value);
	void addBorrowedMediasToUser(CustomerBean customerBean);
	
}
