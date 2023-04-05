package com.example.demo.dominio;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="persona")
public class Persona {
    private static final long serialVersionUID = 1232L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Integer idPersona;

    //@Column(name="id_person")
    @Column(name = "nombre")
    String nombre;
    String apellido;

    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    List<Producto> productos;

}
