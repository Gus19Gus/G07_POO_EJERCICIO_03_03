/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Cliente;
import servicio.ServicioCliente;

/**
 *
 * @author Gus-Gus
 */
public class ClienteControl {
    
    private final ServicioCliente servicioCliente = new ServicioCliente();
    
    public Cliente crear(String [] args){
         var numeroCedula = Integer.valueOf(args[0]);
         var nombreCliente = args[1];
         var apellidoCliente = args[2];
         var direccion= args[3];
         var yearNacimiento=Integer.valueOf(args[4]);
         var telefono = Integer.valueOf(args[5]);
         var correo= args[6];
         var cliente =new Cliente(numeroCedula,nombreCliente,apellidoCliente,direccion,yearNacimiento,telefono,correo);
         this.servicioCliente.crear(cliente);
         return cliente;
    }
    
    public List<Cliente> listar(){
        return this.servicioCliente.listar();
    }
}
