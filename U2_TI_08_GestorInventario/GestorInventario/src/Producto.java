public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    public Producto(String codigo, String nombre, int cantidad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        if (codigo != null) {
            this.codigo = codigo;
        }else{
           System.out.println("El producto no tiene codigo");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }else{
            System.out.println("Cantidad no valida");
        }
    }

}