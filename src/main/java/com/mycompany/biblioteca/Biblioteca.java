package com.mycompany.biblioteca;

/**
 *
 * @author Ssaid
 */
abstract class Biblioteca {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String horario;
    private int afluenciaEstimada;

    public Biblioteca(int id, String nombre, String direccion, String telefono, String horario, int afluenciaEstimada) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.afluenciaEstimada = afluenciaEstimada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getAfluenciaEstimada() {
        return afluenciaEstimada;
    }

    public void setAfluenciaEstimada(int afluenciaEstimada) {
        this.afluenciaEstimada = afluenciaEstimada;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono + ", Horario: " + horario + ", Afluencia Estimada: " + afluenciaEstimada;
    }
}