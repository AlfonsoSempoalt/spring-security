package com.alfonso.platzi.persistence.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "idCategoria")
    private Integer idCategoria;

    @Column(name = "codigoBarras")
    private String codigoBarras;

    @Column(name = "precioVenta")
    private Float precioVenta;

    @Column(name = "cantidadStock")
    private Integer cantidadStock;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne()
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    @OneToMany(mappedBy ="producto")
    private List<ComprasProducto> compras;


    public Producto() {

    }

    public Producto(String nombre, Integer idCategoria, String codigoBarras, Float precioVenta, Integer cantidadStock, Boolean estado) {
        this.nombre = nombre;
        this.idCategoria = idCategoria;
        this.codigoBarras = codigoBarras;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
        this.estado = estado;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_producto=" + id_producto +
                ", nombre='" + nombre + '\'' +
                ", idCategoria=" + idCategoria +
                ", codigoBarras='" + codigoBarras + '\'' +
                ", precioVenta=" + precioVenta +
                ", cantidadStock=" + cantidadStock +
                ", estado=" + estado +
                '}';
    }
}
