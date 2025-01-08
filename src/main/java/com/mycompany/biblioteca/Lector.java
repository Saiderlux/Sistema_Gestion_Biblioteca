/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Ssaid
 */
class Lector extends Persona {
    private String preferencias;
    private String horasLectura;
    private String vigenciaCredencial;

    public Lector(int id, String nombre, String identificacion, String preferencias, String horasLectura, String vigenciaCredencial) {
        super(id, nombre);
        this.preferencias = preferencias;
        this.horasLectura = horasLectura;
        this.vigenciaCredencial = vigenciaCredencial;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getHorasLectura() {
        return horasLectura;
    }

    public void setHorasLectura(String horasLectura) {
        this.horasLectura = horasLectura;
    }

    public String getVigenciaCredencial() {
        return vigenciaCredencial;
    }

    public void setVigenciaCredencial(String vigenciaCredencial) {
        this.vigenciaCredencial = vigenciaCredencial;
    }

    @Override
    public String toString() {
        return super.toString() + ", Preferencias: " + preferencias + ", Horas de Lectura: " + horasLectura + ", Vigencia Credencial: " + vigenciaCredencial;
    }
}
