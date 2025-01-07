package com.wecp.progressive.service.impl;


import com.wecp.progressive.entity.Supplier;
<<<<<<< HEAD
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.repository.SupplierRepository;
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Collections;
=======
import com.wecp.progressive.service.SupplierService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
import java.util.List;

@Service
public class SupplierServiceImplJpa implements SupplierService {

<<<<<<< HEAD
    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    ProductRepository productRepository;

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImplJpa(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAllSuppliers() throws SQLException {
        return supplierRepository.findAll();
=======
    @Override
    public List<Supplier> getAllSuppliers() throws SQLException {
        return List.of();
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
<<<<<<< HEAD
        return supplierRepository.save(supplier).getSupplierId();
=======
        return -1;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() throws SQLException {
<<<<<<< HEAD
        List<Supplier> sortedSuppliers = supplierRepository.findAll();
        Collections.sort(sortedSuppliers);
        return sortedSuppliers;
=======
        return List.of();
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public void updateSupplier(Supplier supplier) throws SQLException {
<<<<<<< HEAD
        supplierRepository.save(supplier);
    }

    @Override
    @Transactional
    public void deleteSupplier(int supplierId) throws SQLException {
        productRepository.deleteBySupplierId(supplierId);
        warehouseRepository.deleteBySupplierId(supplierId);
        supplierRepository.deleteBySupplierId(supplierId);
=======

    }

    @Override
    public void deleteSupplier(int supplierId) throws SQLException {

>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }

    @Override
    public Supplier getSupplierById(int supplierId) throws SQLException {
<<<<<<< HEAD
        return supplierRepository.findBySupplierId(supplierId);
=======
        return null;
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
    }
}