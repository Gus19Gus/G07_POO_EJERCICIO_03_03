/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Gus-Gus
 */
public class ServicioProducto {
    
    private final List<Producto> productoList = new ArrayList<>();
    
    public Producto crear(Producto producto) {
        this.productoList.add(producto);
        return producto;
    }

    public List<Producto> listar() {
        return this.productoList;
    }
}
