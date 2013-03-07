/**
 * 
 */
package com.demo.library.service.services;

import java.util.List;

import com.demo.library.service.beans.EmployeeBean;

/**
 * @author zo
 *
 */
public interface IEmployeeService {

	EmployeeBean getEmployeeById(int id);
	List<EmployeeBean> getAllEmployees();
	void insertEmployee(EmployeeBean employeeBean);
	void updateEmployee(EmployeeBean employeeBean);
	void deleteEmployee(EmployeeBean employeeBean);
}
