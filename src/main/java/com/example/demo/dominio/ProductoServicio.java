package com.example.demo.dominio;

import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {

    RepositorioProducto repositorioProducto;
    public ProductoServicio(RepositorioProducto repositorioProducto){
        this.repositorioProducto= repositorioProducto;
    }

    public Object crearProducto(Producto producto){
        return repositorioProducto.save(producto);
    }
}
