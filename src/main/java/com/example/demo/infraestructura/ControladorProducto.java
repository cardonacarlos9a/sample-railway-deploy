package com.example.demo.infraestructura;

import com.example.demo.dominio.Producto;
import com.example.demo.dominio.ProductoServicio;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/producto")
public class ControladorProducto {



    ProductoServicio productoServicio;

    public ControladorProducto(ProductoServicio productoServicio){
        this.productoServicio = productoServicio;
    }
    @PostMapping("/crear")
    public Object crearProducto(@RequestBody Producto producto){
        return productoServicio.crearProducto(producto);
    }


}
