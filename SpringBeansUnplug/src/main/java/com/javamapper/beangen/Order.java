package com.javamapper.beangen;

public class Order {
	private long orderId;
	private Customer customer;
	private Double sellingAmt;
	private Double discountAmt;
	private Double totalAmt;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Double getSellingAmt() {
		return sellingAmt;
	}
	public void setSellingAmt(Double sellingAmt) {
		this.sellingAmt = sellingAmt;
	}
	public Double getDiscountAmt() {
		return discountAmt;
	}
	public void setDiscountAmt(Double discountAmt) {
		this.discountAmt = discountAmt;
	}
	public Double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(Double totalAmt) {
		this.totalAmt = totalAmt;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", sellingAmt=" + sellingAmt + ", discountAmt="
				+ discountAmt + ", totalAmt=" + totalAmt + "]";
	}
	
	
}
