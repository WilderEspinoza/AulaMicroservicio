package com.idat.idataula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idataula.entity.AulaDetalle;

@Repository
public interface DetalleAulaRepository extends JpaRepository<AulaDetalle, Integer> {

}
