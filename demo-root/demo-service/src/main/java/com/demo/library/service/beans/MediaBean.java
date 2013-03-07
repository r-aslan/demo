/**
 * 
 */
package com.demo.library.service.beans;

import java.util.Date;


/**
 * @author zo
 *
 */
public class MediaBean {

	private int id;
	private String titre;
	private Date dateSortie;
	private FormatBean formatDisponible;
	private String synopsis;
	private String type;
	private CustomerBean customerBean;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}
	public FormatBean getFormatDisponible() {
		return formatDisponible;
	}
	public void setFormatDisponible(FormatBean formatDisponible) {
		this.formatDisponible = formatDisponible;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CustomerBean getCustomerBean() {
		return customerBean;
	}
	public void setCustomerBean(CustomerBean customerBean) {
		this.customerBean = customerBean;
	}
}
