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
public class Cliente {
    private long cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private Date yearNacimiento;
    private long telefono;
    private String correo;

    public Cliente(long cedula, String nombre, String apellido, String direccion, Date yearNacimiento, long telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.yearNacimiento = yearNacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(Date yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", yearNacimiento=" + yearNacimiento + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
}
