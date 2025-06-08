public class Producto {
    private String nombre;
    private String codigo;
    private int cantidad;

    public Producto(String codigo, String nombre, int cantidad) {
        setCodigo(codigo);
        setCantidad(cantidad);
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("El codigo no puede estar vacio");
        }
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa");
        }
    }
    public int getCantidad() {
        return cantidad;
    }
}

