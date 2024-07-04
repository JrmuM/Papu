
package Controlador;

import Modelo.GestionTrabajadores;
import Modelo.Trabajador;
import Vista.TrabajadorVista;

import java.util.Scanner;


public class TrabajadorControlador {
    private GestionTrabajadores modelo;
    private TrabajadorVista vista;

    public TrabajadorControlador(GestionTrabajadores modelo, TrabajadorVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarTrabajador(String nombre, String puesto, double sueldo) {
        try {
            Trabajador trabajador = new Trabajador(nombre, puesto, sueldo);
            modelo.agregarTrabajador(trabajador);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarTrabajadores() {
        vista.mostrarTrabajadores(modelo.obtenerTrabajadores());
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Mostrar trabajadores");
            System.out.println("3. Salir");

            int opcion = Trabajador.validaNumero(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del trabajador: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el puesto del trabajador: ");
                    String puesto = scanner.nextLine();
                    System.out.print("Ingrese el sueldo del trabajador: ");
                    double sueldo = Double.parseDouble(scanner.nextLine());
                    agregarTrabajador(nombre, puesto, sueldo);
                    break;
                case 2:
                    mostrarTrabajadores();
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
    
    
    
    
    
    

