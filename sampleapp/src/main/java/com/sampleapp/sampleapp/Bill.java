package com.sampleapp.sampleapp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
 
@Entity
public class Bill {
	@Id
private int billno;
private int price;
@OneToOne
@JoinColumn(name="salesid")
private Sales sales;
public int getBillno() {
	return billno;
}
public void setBillno(int billno) {
	this.billno = billno;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Sales getSales() {
	return sales;
}
public void setSales(Sales sales) {
	this.sales = sales;
}

@Override
public String toString() {
	return "Bill [billno=" + billno + ", price=" + price + ", sales=" + sales + "]";
}

}