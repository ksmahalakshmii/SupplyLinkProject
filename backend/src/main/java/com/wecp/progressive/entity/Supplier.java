package com.wecp.progressive.entity;

public class Supplier implements Comparable<Supplier>
{
private int supplierId;
private String supplierName;
private String contactEmail;
private long contactPhone;
private String address;
private String role;
public Supplier() {
    
}
public int getSupplierId() {
    return supplierId;
}
public void setSupplierId(int supplierId) {
    this.supplierId = supplierId;
}
public String getSupplierName() {
    return supplierName;
}
public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
}
public String getContactEmail() {
    return contactEmail;
}
public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
}
public long getContactPhone() {
    return contactPhone;
}
public void setContactPhone(long contactPhone) {
    this.contactPhone = contactPhone;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getRole() {
    return role;
}
public void setRole(String role) {
    this.role = role;
}
@Override
public int compareTo(Supplier o) {
    return this.supplierName.compareTo(o.getSupplierName());
}

}