public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario(3);

        System.out.println("Agregando productos:");
        System.out.println(inv.agregarProducto(new Producto("01", "Producto1", 10)));
        System.out.println(inv.agregarProducto(new Producto("02", "Producto2", 5)));
        System.out.println(inv.agregarProducto(new Producto("03", "Producto3", 20)));
        System.out.println(inv.agregarProducto(new Producto("04", "Producto4", 15)));
        System.out.println("Total de ítems: " + inv.totalItems());

        System.out.println("Buscando productos:");
        System.out.println(inv.buscar("01") != null ? "Producto encontrado" : "Producto no encontrado");
        System.out.println(inv.buscar("05") != null ? "Producto encontrado" : "Producto no encontrado");

        System.out.println("Eliminando producto 02: " + inv.eliminarProducto("002"));
        System.out.println("Agregando producto 04: " + inv.agregarProducto(new Producto("04", "Producto D", 15)));
        System.out.println("Total de ítems: " + inv.totalItems());
        }
}