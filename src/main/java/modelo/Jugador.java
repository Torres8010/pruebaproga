/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Pc Daniel
 */
public class Jugador {
    private String nombre;
    private String posicion ;
    private int codigo ;
    private LocalDate fechaNacimiento;
    private boolean buenJugador;

    public Jugador(String nombre, String posicion, int codigo, LocalDate fechaNacimiento, boolean buenJugador) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;
        this.buenJugador = buenJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isBuenJugador() {
        return buenJugador;
    }

    public void setBuenJugador(boolean buenJugador) {
        this.buenJugador = buenJugador;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", codigo=" + codigo + ", fechaNacimiento=" + fechaNacimiento + ", buenJugador=" + buenJugador + '}';
    }
    
    
}
