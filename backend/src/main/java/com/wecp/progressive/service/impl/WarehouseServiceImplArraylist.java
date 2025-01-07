package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import com.wecp.progressive.entity.Supplier;
=======

>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class WarehouseServiceImplArraylist implements WarehouseService {

    private static List<Warehouse> warehouseList = new ArrayList<>();

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseList;
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        warehouseList.add(warehouse);
        return warehouseList.size();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        List<Warehouse> sortedWarehouses = warehouseList;
        sortedWarehouses.sort(Comparator.comparing(Warehouse::getCapacity)); // Sort by supplier name
        return sortedWarehouses;
    }

    @Override
    public void emptyArrayList() {
        warehouseList = new ArrayList<>();
    }
}