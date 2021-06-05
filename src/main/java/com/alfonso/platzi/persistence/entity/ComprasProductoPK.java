package com.alfonso.platzi.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {
    @Column(name = "id_compra")
    private Long id_compra;

    @Column(name = "id_producto")
    private Long id_producto;

    public ComprasProductoPK() {
    }

    public ComprasProductoPK(Long id_compra, Long id_producto) {
        this.id_compra = id_compra;
        this.id_producto = id_producto;
    }

    public Long getId_compra() {
        return id_compra;
    }

    public void setId_compra(Long id_compra) {
        this.id_compra = id_compra;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }
}
