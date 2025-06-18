 public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto etc = new EmpleadoTiempoCompleto("20243ds031", "Brayan", 1500,"Seguro Medico");
        EmpleadoPorHoras eph = new EmpleadoPorHoras("20243ds032", "Osvaldo", 1500, 7);

        System.out.println("El salario de " + etc.getNombre() + " es de: $ " + etc.calcularSalario());
        System.out.println("El salario de " + eph.getNombre() + " es de: $ " + eph.calcularSalario());
    }
}