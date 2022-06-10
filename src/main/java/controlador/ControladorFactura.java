/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Cliente;
import modelo.Factura;
import servicio.ServicioFactura;

/**
 *
 * @author Gus-Gus
 */
public class ControladorFactura {
    
    private final ServicioFactura servicioFactura = new ServicioFactura();
    
    public Factura crear(String []args){
        var direccion = args[0];
        var producto = args[1];
        var total = Integer.valueOf(args[2]);
        var cantidad = Integer.valueOf(args[3]);
        var factura = new Factura(0, direccion, 0, 0);
        this.servicioFactura.crear(factura);
        return factura;
    }
    public List<Factura> listar(){
        return this.servicioFactura.listar();
    }
}
