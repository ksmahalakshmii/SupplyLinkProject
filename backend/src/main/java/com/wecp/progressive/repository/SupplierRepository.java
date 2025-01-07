package com.wecp.progressive.repository;

<<<<<<< HEAD
import com.wecp.progressive.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    void deleteBySupplierId(@Param("supplierId") int supplierId);

    Supplier findBySupplierId(@Param("supplierId") int supplierId);
=======

public interface SupplierRepository {
>>>>>>> fe217c374984a0896e7a983eb4d68aacf6963d68
}
