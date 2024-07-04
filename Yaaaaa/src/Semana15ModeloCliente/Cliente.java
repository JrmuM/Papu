
package Semana15ModeloCliente;

public class Cliente {
    private String dni;
    private String apellido;
    private String correo;
    private String direccion;
    private String fecha_nacimineto;
    private CuentaBancaria[] cuentas = new CuentaBancaria[5];
    
    
    public Cliente() {
    }

    // Constructor parametrizado (algunos atributos)
    public Cliente(String dni, String apellido, String correo_electronico, String direccion, String fecha_nacimiento) {
        this.dni = dni;
        this.apellido = apellido;

    }

    // Constructor completo
    public Cliente(String dni, String apellido, String correo_electronico, String direccion, String fecha_nacimiento, CuentaBancaria[] cuentas) {
        this.dni = dni;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.fecha_nacimineto = fecha_nacimineto;
        this.cuentas = cuentas;
        
    }
    

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha_nacimineto() {
        return fecha_nacimineto;
    }

    public void setFecha_nacimineto(String fecha_nacimineto) {
        this.fecha_nacimineto = fecha_nacimineto;
    }

    public CuentaBancaria[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(CuentaBancaria[] cuentas) {
        this.cuentas = cuentas;
    }

    
    
    
    
    //aca solo falto el thorws Exceptions
      public void AgregarCuenta(CuentaBancaria nuevaCuenta)throws Exception  {
        for (int i = 0; i < cuentas.length; i++) {
            if (cuentas[i] == null) {
                cuentas[i] = nuevaCuenta;
                return;
            }
        }
        throw new IllegalArgumentException("No se pueden agregar más de 5 cuentas.");
    }

  
    //cuidado diferente lo hace
    public String MostrarCuentas() {
        String resultados= "";
        for (int i=0;i<cuentas.length;i++) {
            if (cuentas[i] != null) {
                resultados=cuentas[i].toString()+"\n";
            }
        }
        return resultados;
    }
    //aca cuidado tmb con el MostrarCuentas()
    @Override
    public String toString() {
        return "Dni: " + dni + " Apellido: " + apellido + " Nombre(correo): " + correo + " Cuenta: " + MostrarCuentas();
    }
    
}
