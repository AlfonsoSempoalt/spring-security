package com.alfonso.platzi.persistence;

import com.alfonso.platzi.domain.Product;
import com.alfonso.platzi.domain.repository.ProductRepository;
import com.alfonso.platzi.persistence.CRUD.ProductoCrudRepository;
import com.alfonso.platzi.persistence.entity.Producto;
import com.alfonso.platzi.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {


    private ProductoCrudRepository repository;
    private ProductMapper productMapper;

    @Autowired
    public ProductoRepository(ProductoCrudRepository repository, ProductMapper productMapper) {
        this.repository = repository;
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) repository.findAll();
        return productMapper.toProducts(productos);
    }

    @Override
    public Optional<List<Product>> getByCategory(Long categoryId) {
        List<Producto> products = (List<Producto>) repository.findByidCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(productMapper.toProducts(products));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(Long quantity) {
        Optional<List<Producto>> products = repository.findByCantidadStockLessThanAndEstado(quantity, true);
        return products.map(productos -> productMapper.toProducts(productos));
    }

    @Override
    public Optional<Product> getProduct(Long productId) {
        return repository.findById(productId)
                .map(producto -> productMapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        return productMapper.toProduct
                (repository.save(productMapper.toProducto(product)));
    }

    @Override
    public void delete(Long idProducto) {
        repository.deleteById(idProducto);
    }


}
