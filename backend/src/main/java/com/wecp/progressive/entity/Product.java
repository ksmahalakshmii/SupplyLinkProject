package com.wecp.progressive.entity;

public class Product 
{
private int productId;
private int warehouseId;
private String productName;
private String text;
private int quantity;
private double price;
public Product() {
}
public int getProductId() {
    return productId;
}
public void setProductId(int productId) {
    this.productId = productId;
}
public int getWarehouseId() {
    return warehouseId;
}
public void setWarehouseId(int warehouseId) {
    this.warehouseId = warehouseId;
}
public String getProductName() {
    return productName;
}
public void setProductName(String productName) {
    this.productName = productName;
}
public String getText() {
    return text;
}
public void setText(String text) {
    this.text = text;
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}

}