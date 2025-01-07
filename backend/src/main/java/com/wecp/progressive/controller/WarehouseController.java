package com.wecp.progressive.controller;

<<<<<<< HEAD
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.impl.WarehouseServiceImplJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    WarehouseServiceImplJpa warehouseServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Warehouse>> getAllWarehouses() throws SQLException {
        List<Warehouse> warehouses = warehouseServiceImplJpa.getAllWarehouses();
        return new ResponseEntity<>(warehouses, HttpStatus.OK);
    }

    @GetMapping("/{warehouseId}")
    public ResponseEntity<Warehouse> getWarehouseById(@PathVariable int warehouseId) {
        try {
            Warehouse warehouse = warehouseServiceImplJpa.getWarehouseById(warehouseId);
            if (warehouse != null) {
                return new ResponseEntity<>(warehouse, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Integer> addWarehouse(@RequestBody Warehouse warehouse) {
        try {
            int warehouseId = warehouseServiceImplJpa.addWarehouse(warehouse);
            return new ResponseEntity<>(warehouseId, HttpStatus.CREATED);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{warehouseId}")
    public ResponseEntity<Void> updateWarehouse(@PathVariable int warehouseId, @RequestBody Warehouse warehouse) {
        try {
            warehouse.setWarehouseId(warehouseId);
            warehouseServiceImplJpa.updateWarehouse(warehouse);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{warehouseId}")
    public ResponseEntity<Void> deleteWarehouse(@PathVariable int warehouseId) {
        try {
            warehouseServiceImplJpa.deleteWarehouse(warehouseId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/supplier/{supplierId}")
    public ResponseEntity<List<Warehouse>> getWarehousesBySupplier(@PathVariable int supplierId) throws SQLException {
        List<Warehouse> warehouses = warehouseServiceImplJpa.getWarehouseBySupplier(supplierId);
        return new ResponseEntity<>(warehouses, HttpStatus.OK);
    }
}
=======
import com.wecp.progressive.entity.Warehouse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WarehouseController {

    public ResponseEntity<List<Warehouse>> getAllWarehouses() {
        return null;
    }

    public ResponseEntity<Warehouse> getWarehouseById(int warehouseId) {
        return null;
    }

    public ResponseEntity<Integer> addWarehouse(Warehouse warehouse) {
        return null;
    }

    public ResponseEntity<Void> updateWarehouse(int warehouseId, Warehouse warehouse) {
        return null;
    }

    public ResponseEntity<Void> deleteWarehouse(int warehouseId) {
        return null;
    }


    public ResponseEntity<List<Warehouse>> getWarehousesBySupplier(int supplierId) {
        return null;
    }
}
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
