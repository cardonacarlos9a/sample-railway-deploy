package com.example.demo.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "producto")
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    @Column(name = "nombre")
    String nombreProducto;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    Persona persona;

}
