package com.alfonso.platzi.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
public class Cliente  implements Serializable {
    @Id
    @Column(name ="id_cliente")
    private String id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "celular")
    private Long celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name="correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy= "cliente")
    private List<Compra> compras;


}
