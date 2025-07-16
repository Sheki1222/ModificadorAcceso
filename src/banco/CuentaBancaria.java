package banco;

public class CuentaBancaria {
    public String numeroCuenta;
    public String titular;
    public double saldo;

    public void mostrarInformacion() {

        System.out.println("Jorge empezó a colaborar aquí")
        System.out.println("Nombre: JESUS ABRIL con cuenta " + numeroCuenta);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}
