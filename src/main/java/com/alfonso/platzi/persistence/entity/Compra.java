package com.alfonso.platzi.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "compras")
@Entity
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long id_compra;

    @Column(name = "id_cliente")
    private String idCliente;

    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private LocalDateTime fecha;

    @Column(name = "medioPago")
    private String medioPago;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "estado")
    private String estado;

    @ManyToOne()
    @JoinColumn(name = "id_cliente",updatable = false, insertable = false)
    private Cliente cliente;

    @OneToMany(mappedBy ="compra")
    private List<ComprasProducto> productos;

    public Compra() {

    }

    public Compra(String idCliente, LocalDateTime fecha, String medioPago, String comentario, String estado) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.medioPago = medioPago;
        this.comentario = comentario;
        this.estado = estado;
    }

    public void setId_compra(Long id_compra) {
        this.id_compra = id_compra;
    }

    public Long getId_compra() {
        return id_compra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "id_compra=" + id_compra +
                ", idCliente='" + idCliente + '\'' +
                ", fecha=" + fecha +
                ", medioPago='" + medioPago + '\'' +
                ", comentario='" + comentario + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
