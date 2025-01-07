/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author Ssaid
 */
interface Prestamo {
    void prestarLibro(Libro libro, Lector lector, int diasPrestamo, String domicilio);
    void devolverLibro(Libro libro, String fechaDevolucion);
}
