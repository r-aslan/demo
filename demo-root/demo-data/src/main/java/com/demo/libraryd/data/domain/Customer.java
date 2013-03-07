/**
 * 
 */
package com.demo.libraryd.data.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author zo
 * Class Customer exending superclass Person
 */
@Entity(name="CUSTOMER")
@Table(name="CLIENT")
public class Customer extends Person {
	
	@Column(name="NUMERO")
	private int number;
	
	/**
	 * remaining credit
	 */
	@Column(name="CREDIT")
	private int credit;

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getNumber() {
		return number;
	}

	//add loans private List<AbstractMedia> listLoans; @OneToMany
	//list of all medias borrowed by the customer
	//@Transient
	@OneToMany(mappedBy="customer", fetch=FetchType.EAGER, cascade = CascadeType.MERGE)
	private List<AbstractMedia> loans;
	
	public void setNumber(int number) {
		this.number = number;
	}

	public List<AbstractMedia> getLoans() {
		return loans;
	}

	public void setLoans(List<AbstractMedia> loans) {
		this.loans = loans;
	}
}
