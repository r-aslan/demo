/**
 * 
 */
package com.demo.library.service.beans;

import java.util.List;


/**
 * @author zo
 *
 */
public class CustomerBean extends PersonBean{

	private int number;
	private int credit;

	public int getNumber() {
		return number;
	}
	private List<MediaBean> loans;
	
	private int totalPrice;

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}


	public List<MediaBean> getLoans() {
		return loans;
	}

	public void setLoans(List<MediaBean> loans) {
		this.loans = loans;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
}
