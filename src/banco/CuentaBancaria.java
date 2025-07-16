package banco;

public class CuentaBancaria {
    public String numeroCuenta;
    public String titular;
    public double saldo;

    public void mostrarInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}
