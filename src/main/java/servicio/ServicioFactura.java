/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Factura;

/**
 *
 * @author Gus-Gus
 */
public class ServicioFactura {
    
    private final List<Factura> facturaList = new ArrayList<>();
    
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

    public List<Factura> listar() {
        return this.facturaList;
}
}