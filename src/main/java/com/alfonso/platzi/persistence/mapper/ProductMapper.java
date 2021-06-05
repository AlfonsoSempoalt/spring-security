package com.alfonso.platzi.persistence.mapper;

import com.alfonso.platzi.domain.Product;
import com.alfonso.platzi.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
@NoRepositoryBean
public interface ProductMapper {
    @Mappings({
            // target es a lo que lo queremos hacer y source de donde lo sacamos el dato
            @Mapping(target = "productId", source = "id_producto"),
            @Mapping(target = "name", source = "nombre"),
            @Mapping(target = "categoryId", source = "idCategoria"),
            @Mapping(target = "price", source = "precioVenta"),
            @Mapping(target = "stock", source = "cantidadStock"),
            @Mapping(target = "active", source = "estado"),
            @Mapping(target = "category", source = "categoria")
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
