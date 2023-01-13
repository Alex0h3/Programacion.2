
//Nuestra clase cuenta
import java.util.Date;

public class Cuenta {

    // Atributos de nuestra clase
    private String nombreTitular;
    private String pin;
    private double saldo;
    private String numeroDeCuenta;
    private Date fecha;

    // Nuestro constructor
    public Cuenta(String nombreTitular, String pin, double saldo, String numeroDeCuenta, Date fecha) {
        this.nombreTitular = nombreTitular;
        this.pin = pin;
        this.numeroDeCuenta = numeroDeCuenta;
        this.fecha = fecha;
        // ayuda para que no inicie en saldo negativo
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }

    // Creamos nuestros getterss y setters
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Métodos para operar con la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("\nOperacion completada.");
        } else {
            System.out.println("\nCantidad a ingresar \'Debe ser monto positivo\'");
        }
    }

    public void retirar(double cantidad) {
        if (saldo - cantidad < 0) {
            System.out.println("\nNo hay saldo suficiente para retirar");
        } else {
            saldo -= cantidad;
            System.out.println("\nOperacion completada.");
        }
    }

}
