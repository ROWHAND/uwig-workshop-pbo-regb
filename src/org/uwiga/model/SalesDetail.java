package org.uwiga.model;

public class SalesDetail {

	private Integer idOrder;
	private String pCode;
	private Integer qty;
	private Double sPrice;
	private Double discProduct;
	public Integer getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Double getsPrice() {
		return sPrice;
	}
	public void setsPrice(Double sPrice) {
		this.sPrice = sPrice;
	}
	public Double getDiscProduct() {
		return discProduct;
	}
	public void setDiscProduct(Double discProduct) {
		this.discProduct = discProduct;
	}
	@Override
	public String toString() {
		return "SalesDetail [idOrder=" + idOrder + "]";
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
		SalesDetail other = (SalesDetail) obj;
		if (idOrder == null) {
			if (other.idOrder != null)
				return false;
		} else if (!idOrder.equals(other.idOrder))
			return false;
		return true;
	}
	
	
}
