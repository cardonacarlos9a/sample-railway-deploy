package com.example.demo.infraestructura;

import com.example.demo.dominio.Persona;
import com.example.demo.dominio.PersonaServicio;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/persona")
public class ControladorPersona {

    PersonaServicio personaServicio;

    public ControladorPersona(PersonaServicio personaServicio) {
        this.personaServicio = personaServicio;
    }

    List<Persona> personas = new ArrayList<>();

    @PostMapping("/guardar-persona")
    public Object guardarPersona(@RequestBody Persona persona) {

        return personaServicio.crearPersona(persona);
    }

    @GetMapping("/{id}")
    public Object buscarPersona(@PathVariable Integer id) {

        return personaServicio.buscarPersonaPorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Persona> buscarPersonasPorNombre(@PathVariable String nombre) {
        return personaServicio.buscarPersonaPorNombre(nombre);
    }

    @DeleteMapping("/borrar/{id}")
    public void borrarPersona(@PathVariable Integer id) {
        personaServicio.borrarPersona(id);
    }

    @GetMapping("/saludar/decirhola")
    public String saludar() {
        return "Hola a Todos!";
    }


    //@PutMapping
    //@DeleteMapping

}
