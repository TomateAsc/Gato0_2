package com.example.gato02errores;
import java.io.Serializable;

public class Ganadores implements Serializable{
    String nombre;
    int puntuacion;

    public Ganadores(String nomb, int punt)
    {
        this.nombre = nomb;
        this.puntuacion = punt;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setPuntuacion(int punt)
    {
        this.puntuacion = punt;
    }

    public String getNombre()
    {
        return this.nombre;
    }
    public int getPuntuacion()
    {
        return this.puntuacion;
    }

}
