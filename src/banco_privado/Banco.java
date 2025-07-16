package banco_privado;

public class Banco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta("002");
        cuenta.setTitular("Ana Torres");
        cuenta.setSaldo(2500.75);

        cuenta.mostrarInformacion();
    }
}
