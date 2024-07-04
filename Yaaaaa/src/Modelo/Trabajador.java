package Modelo;

public class Trabajador {
    private String nombre;
    private String puesto;
    private double sueldo;

    public Trabajador(String nombre, String puesto, double sueldo) {
        this.nombre = nombre;
        this.puesto = puesto;
        setSueldo(sueldo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSueldo(double sueldo) {
        if (sueldo <= 0) {
            throw new IllegalArgumentException("El sueldo no puede ser cero o negativo.");
        }
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado: "+nombre+" "
                +"Puesto: "+puesto+" "
                +"Sueldo: "+sueldo+" ";
    }

    public static int validaNumero(String input) throws NumberFormatException {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Entrada no válida: " + input);
        }
    }
}