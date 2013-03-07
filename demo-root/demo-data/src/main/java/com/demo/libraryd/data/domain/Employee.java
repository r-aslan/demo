/**
 * 
 */
package com.demo.libraryd.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author zo
 * Class Customer exending superclass Person
 */
@Entity(name="EMPLOYE")
@Table(name="EMPLOYE")
public class Employee extends Person {

	@Column(name="SALAIRE")
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
