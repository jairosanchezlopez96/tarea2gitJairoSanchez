/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2gitjairosanchez;

/**
 *
 * @author jairo
 */
public class Jugador {
    String nombre;
    int votos;
    int id;
    
    private Jugador( String nombre, int id, int votos){
    this.nombre = nombre;
    this.id = id;
    this.votos = votos;
    }
}
