package com.iesam.laliga2023.domain;

public class Equipo {
    private Integer Codigo;
    private String Nombre;
    private String Telefono;
    private String Direccion;

    public Equipo(Integer codigo, String nombre, String telefono, String direccion) {
        Codigo = codigo;
        Nombre = nombre;
        Telefono = telefono;
        Direccion = direccion;
    }

    public Integer getCodigo() {
        return Codigo;
    }

    public void setCodigo(Integer codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
