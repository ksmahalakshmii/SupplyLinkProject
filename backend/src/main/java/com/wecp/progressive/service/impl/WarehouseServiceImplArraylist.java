package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService
{
    List<Warehouse> warehouseList=new ArrayList<>();

    @Override
    public int addWarehouse(Warehouse warehouse) 
    {
        warehouseList.add(warehouse);
        return warehouse.getWarehouseId();
    }

    @Override
    public List<Warehouse> getAllWarehouses() {
        return warehouseList;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() 
    {
        Collections.sort(warehouseList);
        return warehouseList;
    }

    @Override
    public void emptyArrayList()
    {
        warehouseList=new ArrayList<>();
    }

}