package com.sampleapp.sampleapp;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
 
@Entity
public class Customer {
	@Id
private String custName;
private int id;
@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
private List<Item> item;
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<Item> getItem() {
	return item;
}
public void setItem(List<Item> item) {
	this.item = item;
}
@Override
public String toString() {
	return "Customer [custName=" + custName + ", id=" + id + ", item=" + item + "]";
}
}