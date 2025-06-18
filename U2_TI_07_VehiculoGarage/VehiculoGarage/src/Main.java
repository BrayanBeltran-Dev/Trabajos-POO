public class Main {
    public static void main(String[] args) {
        Garage gr = new Garage(4);

        Coche v1 = new Coche("HOLA123", "BMW", 4);
        Coche v2 = new Coche("HOLA456", "Audi", 2);
        Motocicleta v3 = new Motocicleta("HOLA012", "Mortalika", true);
        Motocicleta v4 = new Motocicleta("HOLA034", "Ducasi", false);

        gr.estacionar(v1);
        gr.estacionar(v2);
        gr.estacionar(v3);
        gr.estacionar(v4);

        gr.retirar(v4.getPlaca());

        System.out.println("Numero de vehiculos en el garage: "+gr.contarVehiculos());







    }
}