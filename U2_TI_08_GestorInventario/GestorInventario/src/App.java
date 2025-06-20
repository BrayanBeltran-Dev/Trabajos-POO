public class App {
    public static void main(String[] args) throws Exception {
        Inventario inv = new Inventario(3);

        Producto p1 = new Producto("PROD1", "PC", 4);
        Producto p2 = new Producto("PROD2", "Laptop", 5);
        Producto p3 = new Producto("PROD3", "Movil", 6);
        Producto p4 = new Producto("PROD4", "TV", 7);

        System.out.println("Se agrego el producto1: " + inv.agregarProducto(p1));
        System.out.println("Se agrego el producto2: " + inv.agregarProducto(p2));
        System.out.println("Se agrego el producto3: " + inv.agregarProducto(p3));
        System.out.println("Se agrego el producto4: " + inv.agregarProducto(p4));

        System.out.println("Buscando producto... " + inv.buscar("PROD1"));
        System.out.println("Buscando producto... " + inv.buscar("PROD4"));

        System.out.println("Eliminando producto...  " + inv.eliminarProducto("PROD1"));
        System.out.println("Se agrego el producto4: " + inv.agregarProducto(p4));

        System.out.println("El total de items es: " + inv.totalIteems());
        

    }
}
