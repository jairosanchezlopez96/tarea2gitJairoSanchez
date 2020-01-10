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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public Jugador( String nombre, int id, int votos){
    this.nombre = nombre;
    this.id = id;
    this.votos = votos;
    }
}
