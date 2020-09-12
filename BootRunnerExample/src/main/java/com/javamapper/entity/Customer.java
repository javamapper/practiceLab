package com.javamapper.entity;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.javamapper.utils.Constants;

@Component
public class Customer {

	/*
	 * info.data.customer.id=201 info.data.customer.name=Anil
	 * info.data.customer.invoice.id=I5343 
	 * info.data.customer.invoice.num=201I89773
	 * info.data.customer.order.id=O8989 
	 * info.data.customer.order.date=10/01/2019 10:30 IST
	 */
	@Value("${info.data.customer.id}")
	private Integer customerId;
	@Value("${info.data.customer.invoice.id}")
	private String customerName;
	@Value("${info.data.customer.invoice.num}")
	private String invoiceId;
	@Value("${info.data.customer.order.id}")
	private String orderId;
	@Value("${info.data.customer.order.date}")
	private String orderDateStr;
	private Date orderDate;
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", invoiceId=" + invoiceId
				+ ", orderId=" + orderId + ", orderDate=" + getOrderDate() + "]";
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		if(this.orderDate==null) {
			return Constants.getValue(this.orderDateStr);
		}
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	
}
