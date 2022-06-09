/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Factura;
import servicio.ServicioFactura;

/**
 *
 * @author Gus-Gus
 */
public class ControladorFactura {
    
    private final ServicioFactura servicioFactura = new ServicioFactura();
    
    public Factura crear(String [] params){
        var factura = new Factura(Integer.valueOf(params[0]),params[1]);
        this.servicioFactura.crear(factura);
        return factura;
    }
    
    public List<Factura> listar()
    {
        return this.servicioFactura.listar();
    }
}
