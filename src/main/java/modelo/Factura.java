/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Gus-Gus
 */
public class Factura {
    
    private int numFactura;
    private Cliente cliente;
    private String direccion;
    private Producto producto;
    private int catidad;
    private Date fecha;
    private int total;

    public Factura(int numFactura, Cliente cliente, String direccion, Producto producto, int catidad, Date fecha, int total) {
        this.numFactura = numFactura;
        this.cliente = cliente;
        this.direccion = direccion;
        this.producto = producto;
        this.catidad = catidad;
        this.fecha = fecha;
        this.total = total;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCatidad() {
        return catidad;
    }

    public void setCatidad(int catidad) {
        this.catidad = catidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "numFactura=" + numFactura + ", cliente=" + cliente + ", direccion=" + direccion + ", producto=" + producto + ", catidad=" + catidad + ", fecha=" + fecha + ", total=" + total + '}';
    }
}
