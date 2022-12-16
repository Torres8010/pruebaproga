/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Jugador;

/**
 *
 * @author Pc Daniel
 */
public interface JugadorService {
      public void crear(Jugador jugador);
    public List<Jugador> listar();
    
}
