package org.uwiga.model;

import java.util.Date;

public class SalesHeader {

	private Integer idOrder;
	private Integer idTrans;
	private Date transDate;
	private Double disc;
	public Integer getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}
	public Integer getIdTrans() {
		return idTrans;
	}
	public void setIdTrans(Integer idTrans) {
		this.idTrans = idTrans;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public Double getDisc() {
		return disc;
	}
	public void setDisc(Double disc) {
		this.disc = disc;
	}
	@Override
	public String toString() {
		return "SalesHeader [idOrder=" + idOrder + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idOrder == null) ? 0 : idOrder.hashCode());
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
		SalesHeader other = (SalesHeader) obj;
		if (idOrder == null) {
			if (other.idOrder != null)
				return false;
		} else if (!idOrder.equals(other.idOrder))
			return false;
		return true;
	}
	
	
}
