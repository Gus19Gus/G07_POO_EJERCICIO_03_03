/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Gus-Gus
 */
public class ServicioCliente implements IServicioCliente {
    
    private final List<Cliente> clienteList = new ArrayList<>();

    @Override
    public Cliente crear(Cliente cliente) {
        this.clienteList.add(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> listar() {
        return this.clienteList;
    }

    @Override
    public Cliente buscarCodigo(int codigo) {
        var cliente = new Cliente();
        for(Cliente cli:this.clienteList){
           if(cli.getNumCedula()==codigo){
               cliente = cli;
               break;
           }
       }
       return cliente;
    }

    @Override
    public Cliente eliminar(int codigo) {
       var cliente = this.buscarCodigo(codigo);
       this.clienteList.remove(cliente);
       return cliente;
    }
    
    
    
}
