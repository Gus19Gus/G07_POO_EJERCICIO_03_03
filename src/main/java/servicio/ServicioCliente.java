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
public class ServicioCliente {
    
    private final List<Cliente> clienteList = new ArrayList<>();
    
    public Cliente crear(Cliente cliente) {
        this.clienteList.add(cliente);
        return cliente;
    }

    public List<Cliente> listar() {
        return this.clienteList;
    }
}
