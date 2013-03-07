package com.demo.libraryd.data.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author zo
 * Abstract class used for single-table inheritance
 */
@Entity(name="MEDIA")
@Table(name="MEDIA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_MEDIA", discriminatorType=DiscriminatorType.STRING)
@NamedQueries({
	@NamedQuery(name="getAvailableMedias", query="FROM MEDIA where customer is null"),
	@NamedQuery(name="updateMediaCustomers", query="UPDATE MEDIA SET customer = :customer WHERE id = :id"),
	@NamedQuery(name="updateListOfMedias", query="UPDATE MEDIA SET customer = :customer WHERE id in (:idList)"),
	@NamedQuery(name="getMediasByCustomer", query="FROM MEDIA where customer = :customer")
})
public class AbstractMedia{

	@Id
	@Column(name="ID")@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="TYPE_MEDIA", insertable=false, updatable=false)
	private String type;
	
	@Column(name="TITRE")
	private String titre;
	
	@Column(name="DATE_SORTIE")
	private Date dateSortie;
	
	@Column(name="SYNOPSIS")
	private String synopsis;
	
	//add borrower private Customer customer; @ManyToOne
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "ID_FORMAT")
	private Format format;


	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

/*	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}*/

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	
}
