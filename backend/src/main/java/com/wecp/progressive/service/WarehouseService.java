package com.wecp.progressive.service;

import com.wecp.progressive.entity.Warehouse;

import java.sql.SQLException;
import java.util.List;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses() throws SQLException;

    int addWarehouse(Warehouse warehouse) throws SQLException;

    List<Warehouse> getWarehousesSortedByCapacity() throws SQLException;

    default public void emptyArrayList() {
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java class
    default void updateWarehouse(Warehouse warehouse) throws SQLException {
    }

    default void deleteWarehouse(int warehouseId) throws SQLException {
    }

    default Warehouse getWarehouseById(int warehouseId) throws SQLException {
        return null;
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException {
        return null;
    }
}
=======
    default List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }
}
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
