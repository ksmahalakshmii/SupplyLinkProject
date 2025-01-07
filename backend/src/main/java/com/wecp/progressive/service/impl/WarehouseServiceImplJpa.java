package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Warehouse;
<<<<<<< HEAD
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Collections;
=======
import com.wecp.progressive.service.WarehouseService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
import java.util.List;

@Service
public class WarehouseServiceImplJpa implements WarehouseService {

<<<<<<< HEAD
    @Autowired
    ProductRepository productRepository;

    private WarehouseRepository warehouseRepository;

    @Autowired
    public WarehouseServiceImplJpa(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
        return warehouseRepository.findAll();
=======
    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException {
        return List.of();
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException {
<<<<<<< HEAD
        return warehouseRepository.save(warehouse).getWarehouseId();
=======
        return -1;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException {
<<<<<<< HEAD
        List<Warehouse> sortedWarehouses = warehouseRepository.findAll();
        Collections.sort(sortedWarehouses);
        return sortedWarehouses;
=======
        return List.of();
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
<<<<<<< HEAD
        warehouseRepository.save(warehouse);
=======

>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public void deleteWarehouse(int warehouseId) throws SQLException {
<<<<<<< HEAD
        productRepository.deleteByWarehouseId(warehouseId);
        warehouseRepository.deleteById(warehouseId);
=======

>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException {
<<<<<<< HEAD
        return warehouseRepository.findByWarehouseId(warehouseId);
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException {
        return warehouseRepository.findAllBySupplier_SupplierId(supplierId);
=======
        return null;
    }

    @Override
    public List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }
}