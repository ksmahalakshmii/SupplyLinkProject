package com.wecp.progressive.service;

import com.wecp.progressive.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {

    List<Product> getAllProducts() throws SQLException;

    Product getProductById(int productId) throws SQLException;

<<<<<<< HEAD
    int addProduct(Product Product) throws SQLException;

    void updateProduct(Product Product) throws SQLException;
=======
    int addProduct(Product product) throws SQLException;

    void updateProduct(Product product) throws SQLException;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68

    void deleteProduct(int productId) throws SQLException;

    //Do not implement these methods in ProductServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Product> getAllProductByWarehouse(int warehouseId) throws SQLException {
        return null;
    }
}
=======
    default List<Product> getAllProductByWarehouse(int warehouseId) {
        return null;
    }
}
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
