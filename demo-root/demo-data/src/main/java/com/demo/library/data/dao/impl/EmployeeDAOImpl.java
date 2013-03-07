/**
 * 
 */
package com.demo.library.data.dao.impl;

import com.demo.library.data.dao.IEmployeDAO;
import com.demo.library.data.domain.Employee;

/**
 * @author zo
 * Implementation of IEmployeDAO
 */
public class EmployeeDAOImpl extends CrudDAOImpl<Employee> implements IEmployeDAO {

	public EmployeeDAOImpl() {
		super(Employee.class);
	}
}
