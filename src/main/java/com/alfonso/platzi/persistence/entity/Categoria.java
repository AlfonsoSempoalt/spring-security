package com.alfonso.platzi.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Table(name = "categorias")
@Data
@NoArgsConstructor
@Entity
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private Boolean estado;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos;

    public Categoria(String descripcion, Boolean estado) {
        this.descripcion = descripcion;
        this.estado = estado;
    }


}
