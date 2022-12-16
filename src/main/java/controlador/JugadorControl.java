/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Jugador;
import servicio.JugadorServiceImpl;

/**
 *
 * @author Pc Daniel
 */
public class JugadorControl {
    private JugadorServiceImpl jugadorServiceImpl =new JugadorServiceImpl();
    public String crear(String[] data) {
        String retorno="No se puede crear Universidad";
        String nombre = data[0];
        String posicion = data[1];
        int codigo = Integer.valueOf(data[2]).intValue();
        var year=Integer.valueOf(data[3]);
        var mes=Integer.valueOf(data[4]);
        var dia=Integer.valueOf(data[5]);  
        boolean buenJugador =Boolean.valueOf(data[6]);
        
       
        
        var jugador= new Jugador(nombre,posicion,codigo,LocalDate.of(year, mes, dia),buenJugador);
        this.jugadorServiceImpl.crear(jugador);
        return retorno;}

   
    
    public List<Jugador> listar(){
        return this.jugadorServiceImpl.listar();
    }
    
}
