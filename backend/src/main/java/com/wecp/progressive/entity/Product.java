package com.wecp.progressive.entity;

<<<<<<< HEAD
import javax.persistence.*;
=======
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
<<<<<<< HEAD

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "warehouseId")
    private Warehouse warehouse;
=======
    private int warehouseId;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    private String productName;
    private String productDescription;
    private int quantity;
    private Long price;

    public Product() {
    }

    public Product(int productId, int warehouseId, String productName, String productDescription, int quantity, Long price) {
        this.productId = productId;
<<<<<<< HEAD
        this.warehouse.setWarehouseId(warehouseId);
=======
        this.warehouseId = warehouseId;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
        this.productName = productName;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

<<<<<<< HEAD
    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
=======
    public int getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}