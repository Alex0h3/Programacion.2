
import java.util.Date;
import java.util.Scanner;

public class Cajero {

    // Variables/objetos de ámbito global, visibles para todos los métodos
    private static Cuenta cuenta1 = new Cuenta("Alexis Sanchez", "5678", 1000, "09876543", new Date());
    private static Cuenta cuenta2 = new Cuenta("Monse Gutierrez", "8526", 506, "12345678", new Date());
    // uso de Scaner para pedir info desde la consola
    private static Scanner teclado = new Scanner(System.in);

    // Programa principal
    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n\t\tSistema Control Bancario \'Cajero\' ");
            System.out.println("\tAlexis Sanchez Trejo, EXTRAORDINARIO\n");
            System.out.println("[1] Retirar saldo");
            System.out.println("[2] Depositar saldo");
            System.out.println("[3] Consultar saldo");
            System.out.println("[4] EXIT");
            System.out.print("Elija cualquiera de estas opciones: ");
            opcion = Integer.parseInt(teclado.nextLine()); // Aqui introducimos nuestra opcion deseada

            switch (opcion) {
                case 1:
                    retirar();
                    break;
                case 2:
                    ingresar();
                    break;
                case 3:
                    consultarSaldo();
                    break;
                case 4:
                    System.out.println("\nPrograma Finalizado");
                    break;
                default:
                    System.out.println("\nElija Opcion");
            }
        }
    }

    // Método
    /* aqui es donde podemos retirar, consultar mediante nuestra cuenta */
    private static void retirar() {

        System.out.println("\nDigite su numero de cuenta de 8 digitos");
        String NumeroDeCuenta = teclado.nextLine(); // introducimos desde el teclado
        System.out.println("Digite su PIN");
        String pin = teclado.nextLine(); // introducimos desde el teclado
        if (!cuenta1.getNumeroDeCuenta().equals(NumeroDeCuenta)) {
            System.out.println("\nNo existe Cuenta asociada a este numero de cuenta");
        } else {
            System.out.print("\nCantidad que desea retirar: $ ");
            double cantidad = Double.parseDouble(teclado.nextLine()); // introducimos desde el teclado
            cuenta1.retirar(cantidad);
        }
    }

    /**
     * Permite ingresar saldo en una Cuenta, previamente identificada mediante
     * numero de cuenta
     */
    private static void ingresar() {

        System.out.println("\nDigite su numero de cuenta de 8 digitos");
        String numeroDeCuenta = teclado.nextLine(); // introducimos desde el teclado
        System.out.println("Digite su PIN");
        String pin = teclado.nextLine(); // introducimos desde el teclado
        if (!cuenta1.getNumeroDeCuenta().equals(numeroDeCuenta)) {
            System.out.println("\nNo existe Cuenta asociada a este numero de cuenta");
        } else {
            System.out.print("\nCantidad que desea ingresar: $ ");
            double cantidad = Double.parseDouble(teclado.nextLine()); // introducimos desde el teclado
            cuenta1.ingresar(cantidad);
        }
    }

    /**
     * Permite consultar saldo de una Cuenta, previamente identificada mediante
     * PIN de acceso
     */
    private static void consultarSaldo() {

        System.out.println("\n Digite su numero de cuenta de 8 digitos");
        String numeroDeCuenta = teclado.nextLine(); // introducimos desde el teclado
        System.out.println("Digite su PIN");
        String pin = teclado.nextLine(); // introducimos desde el teclado
        if (!cuenta1.getNumeroDeCuenta().equals(numeroDeCuenta)) {
            System.out.println("\nNo existe Cuenta asociada a este numero de cuenta");
        } else {
            System.out.println("\nSaldo actual: $ " + cuenta1.getSaldo());
        }
    }
}
