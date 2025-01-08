/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Ssaid
 */
class Empleado extends Persona {
    private String puesto;
    private String horario;

    public Empleado(int id, String nombre, String puesto, String horario) {
        super(id, nombre);
        this.puesto = puesto;
        this.horario = horario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Puesto: " + puesto + ", Horario: " + horario;
    }
}