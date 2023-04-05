package com.example.demo.dominio;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaServicio {
    PersonaRepositorio personaRepositorio;

    public PersonaServicio(PersonaRepositorio personaRepositorio) {
            this.personaRepositorio = personaRepositorio;
    }

    public Object crearPersona(Persona persona){
        return personaRepositorio.save(persona);

    }

    public Object buscarPersonaPorId(Integer idPersona){
        return personaRepositorio.findById(idPersona);
    }

    public List<Persona> buscarPersonaPorNombre(String nombre){
        return personaRepositorio.buscarPorNombre(nombre);
    }

    public void borrarPersona(Integer idPersona){
        personaRepositorio.deleteById(idPersona);
    }

    public void actualizarPersona(Persona persona){

    }

}
