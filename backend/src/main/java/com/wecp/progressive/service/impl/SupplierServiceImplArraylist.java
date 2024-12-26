package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService  
{
  List<Supplier> supplierList=new ArrayList<>();
    @Override
    public int addSupplier(Supplier supplier) 
    {
        supplierList.add(supplier);
        return supplierList.size();
    }
    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierList;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() 
    {
        Collections.sort(supplierList);
        return supplierList;
    }

    public void emptyArrayList()
    {
        supplierList=new ArrayList<>();
    }
}