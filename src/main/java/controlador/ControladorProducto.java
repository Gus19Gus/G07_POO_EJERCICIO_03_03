/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Gus-Gus
 */
public class ControladorProducto {
    
    private final  = new AutoServicio();
    
    public Auto crear(String [] args){
        var auto= new Auto(args[0],Integer.valueOf(args[1]),
                Integer.valueOf(args[2]),Integer.valueOf(args[3]));
        this.autoServicio.crear(auto);
        return auto;
    }
    
    public List<Auto> listar(){
        return this.autoServicio.listar();
        
        
    }
}
