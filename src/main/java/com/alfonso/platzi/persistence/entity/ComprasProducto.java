package com.alfonso.platzi.persistence.entity;


import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "comprasProducto")
@ToString
public class ComprasProducto implements Serializable {
    @EmbeddedId
    private ComprasProductoPK id;

    @Column(name = "cantidad")
    private Integer cantidad;

    @Column(name = "total")
    private Float total;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    public ComprasProducto() {
    }

    public ComprasProducto(ComprasProductoPK id, Integer cantidad, Float total, Boolean estado) {
        this.id = id;
        this.cantidad = cantidad;
        this.total = total;
        this.estado = estado;
    }

    public ComprasProductoPK getId() {
        return id;
    }

    public void setId(ComprasProductoPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
