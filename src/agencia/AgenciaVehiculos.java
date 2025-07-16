package agencia;

public class AgenciaVehiculos {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo();
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setPrecio(23000.00);

        auto.mostrarInformacion();
    }
}
