/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Cliente;

/**
 *
 * @author Gus-Gus
 */
public interface IServicioCliente {
    
    public Cliente crear(Cliente cliente);
    public List<Cliente> listar();
    
}
