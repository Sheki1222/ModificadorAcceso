package banco;

public class Banco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.numeroCuenta = "001";
        cuenta.titular = "Carlos López";
        cuenta.saldo = 1500.50;

        cuenta.mostrarInformacion();
    }
}
