/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Jugador;

/**
 *
 * @author Pc Daniel
 */
public class JugadorServiceImpl {
    private static List<Jugador> jugadorList = new ArrayList<>();

    public void crear(Jugador jugador) {

        this.jugadorList.add(jugador);
    }
    public List<Jugador> listar() {
        return this.jugadorList;
    }
}
