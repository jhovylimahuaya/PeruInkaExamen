package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Ticket extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private Date dateIni;
	private Date dateEn;
	private Customer customer;
	public Date getDateIni() {
		return dateIni;
	}
	public void setDateIni(Date dateIni) {
		this.dateIni = dateIni;
	}
	public Date getDateEn() {
		return dateEn;
	}
	public void setDateEn(Date dateEn) {
		this.dateEn = dateEn;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
