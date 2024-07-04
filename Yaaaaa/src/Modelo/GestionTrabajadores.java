package Modelo;

import Modelo.Trabajador;

public class GestionTrabajadores {
    private Trabajador[] trabajadores;
    private int indiceActual;

    public GestionTrabajadores(int capacidad) {
        trabajadores = new Trabajador[capacidad];
        indiceActual = 0;
    }

    public void agregarTrabajador(Trabajador trabajador) {
        if (indiceActual < trabajadores.length) {
            trabajadores[indiceActual] = trabajador;
            indiceActual++;
        } else {
            System.out.println("No se pueden agregar más trabajadores. Capacidad máxima alcanzada.");
        }
    }

    public Trabajador[] obtenerTrabajadores() {
        return trabajadores;
    }

    
}