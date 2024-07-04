package Vista;

import Controlador.TrabajadorControlador;
import Modelo.GestionTrabajadores;
import Modelo.Trabajador;


public class TrabajadorVista {
    
    public void mostrarTrabajador(Trabajador trabajador) {
        System.out.println(trabajador);
    }

    public void mostrarTrabajadores(Trabajador[] trabajadores) {
        for (Trabajador trabajador : trabajadores) {
            if (trabajador != null) {
                mostrarTrabajador(trabajador);
            }
        }
    }

    public static void main(String[] args) {
        GestionTrabajadores modelo = new GestionTrabajadores(10);
        TrabajadorVista vista = new TrabajadorVista();
        TrabajadorControlador controlador = new TrabajadorControlador(modelo, vista);
        
        controlador.menu();
    }
}