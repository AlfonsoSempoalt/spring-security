package com.alfonso.platzi.persistence.CRUD;

import com.alfonso.platzi.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Long> {
    List<Producto>findByidCategoriaOrderByNombreAsc(Long idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(Long cantidadStock, boolean estado);
}
