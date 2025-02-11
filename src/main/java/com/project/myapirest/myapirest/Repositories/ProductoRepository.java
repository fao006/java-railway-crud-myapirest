package com.project.myapirest.myapirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.myapirest.myapirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
