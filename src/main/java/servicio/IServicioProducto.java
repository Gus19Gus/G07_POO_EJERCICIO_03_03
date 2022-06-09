/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Cliente;
import modelo.Producto;

/**
 *
 * @author Gus-Gus
 */
public interface IServicioProducto {
    
    public Producto crear(Producto producto);
    public List<Producto> listar();
}
