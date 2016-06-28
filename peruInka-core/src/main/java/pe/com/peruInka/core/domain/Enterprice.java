package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Enterprice extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private String businessName;
	private String ruc;
	private String address;
	private String phone;
	private StatusEnterprice statusEnterprice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public StatusEnterprice getStatusEnterprice() {
		return statusEnterprice;
	}
	public void setStatusEnterprice(StatusEnterprice statusEnterprice) {
		this.statusEnterprice = statusEnterprice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	

}
