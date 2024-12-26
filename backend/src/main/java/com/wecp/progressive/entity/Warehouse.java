package com.wecp.progressive.entity;

public class Warehouse implements Comparable<Warehouse>
{
private int warehouseId;
private int supplierId;
private String warehouseName;
private String location;
private double capacity;
public Warehouse() {
}
public int getWarehouseId() {
    return warehouseId;
}
public void setWarehouseId(int warehouseId) {
    this.warehouseId = warehouseId;
}
public int getSupplierId() {
    return supplierId;
}
public void setSupplierId(int supplierId) {
    this.supplierId = supplierId;
}
public String getWarehouseName() {
    return warehouseName;
}
public void setWarehouseName(String warehouseName) {
    this.warehouseName = warehouseName;
}
public String getLocation() {
    return location;
}
public void setLocation(String location) {
    this.location = location;
}
public double getCapacity() {
    return capacity;
}
public void setCapacity(double capacity) {
    this.capacity = capacity;
}
@Override
public int compareTo(Warehouse o) {
    
    return Double.compare(this.capacity, o.getCapacity());
}

}