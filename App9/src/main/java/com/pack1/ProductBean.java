package com.pack1;

import java.io.Serializable;

public class ProductBean implements Serializable
{
private String Pcode;
private String PName;
private String PCompany;
private String PPrice;
private String PQty;
public String getPcode() {
	return Pcode;
}
public void setPcode(String pcode) {
	Pcode = pcode;
}
public String getPName() {
	return PName;
}
public void setPName(String pName) {
	PName = pName;
}
public String getPCompany() {
	return PCompany;
}
public void setPCompany(String pCompany) {
	PCompany = pCompany;
}
public String getPPrice() {
	return PPrice;
}
public void setPPrice(String pPrice) {
	PPrice = pPrice;
}
public String getPQty() {
	return PQty;
}
public void setPQty(String pQty) {
	PQty = pQty;
}
public ProductBean()
{
	
}
}
