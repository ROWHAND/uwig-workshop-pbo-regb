package org.uwiga.model;

import java.util.Date;

public class Customer {

	private String idCustomer;
	private String name;
	private String address;
	private Date lastTrans;
	public String getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getLastTrans() {
		return lastTrans;
	}
	public void setLastTrans(Date lastTrans) {
		this.lastTrans = lastTrans;
	}
	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idCustomer == null) ? 0 : idCustomer.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (idCustomer == null) {
			if (other.idCustomer != null)
				return false;
		} else if (!idCustomer.equals(other.idCustomer))
			return false;
		return true;
	}
	
	
}
