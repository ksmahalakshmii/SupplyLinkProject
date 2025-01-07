package com.wecp.progressive.repository;

<<<<<<< HEAD
import com.wecp.progressive.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse, Integer> {
    Warehouse findByWarehouseId(@Param("warehouseId") int warehouseId);

    List<Warehouse> findAllBySupplier_SupplierId(@Param("supplierId") int supplierId);

    @Modifying
    @Transactional
    @Query("DELETE FROM Warehouse w WHERE w.supplier.supplierId = :supplierId")
    void deleteBySupplierId(@Param("supplierId") int supplierId);
=======

public interface WarehouseRepository {
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
}
