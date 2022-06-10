/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Factura;

/**
 *
 * @author Gus-Gus
 */
public class ServicioFactura implements ISedrvicioFactura {
    
    private final List<Factura> facturaList = new ArrayList<>();

    @Override
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
    return factura;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }

    @Override
    public Factura buscarCodigo(int codigo) {
        
       //var factura = new Factura();
       //for(factura fac:this.facturaList){
       //    if(fac.getCodigo()==i){
        //       factura = fac;
        //       break;
       //    }
      // }
      // return auto;
        return null;
        
       //var factura = new Factura();
       //for(factura fac:this.facturaList){
       //    if(fac.getCodigo()==i){
        //       factura = fac;
        //       break;
       //    }
      // }
      // return auto;
    }

    @Override
    public Factura eliminar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}