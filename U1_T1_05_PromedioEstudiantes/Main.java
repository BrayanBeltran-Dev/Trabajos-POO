import model.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();

        estudiante1.setNombre("Osvaldo");
        estudiante1.setMatricula("2025001");
        estudiante1.setNota(0, 80);
        estudiante1.setNota(1, 75);
        estudiante1.setNota(2, 85);
        estudiante1.setNota(3, 90);
        estudiante1.setNota(4, 70);
        
        estudiante2.setNombre("Brayan");
        estudiante2.setMatricula("2025002");
        estudiante2.setNota(0, 70);
        estudiante2.setNota(1, 70);
        estudiante2.setNota(2, 78);
        estudiante2.setNota(3, 76);
        estudiante2.setNota(4, 80);
        
        estudiante3.setNombre("Nicho");
        estudiante3.setMatricula("2025003");
        estudiante3.setNota(0, 100);
        estudiante3.setNota(1, 100);
        estudiante3.setNota(2, 100);
        estudiante3.setNota(3, 100);
        estudiante3.setNota(4, 100);

        estudiante4.setNombre("Jared");
        estudiante4.setMatricula("2025004");
        estudiante4.setNota(0, 80);
        estudiante4.setNota(1, 90);
        estudiante4.setNota(2, 60);
        estudiante4.setNota(3, 75);
        estudiante4.setNota(4, 85);

        estudiante5.setNombre("Alan");
        estudiante5.setMatricula("2025005");
        estudiante5.setNota(0, 65);
        estudiante5.setNota(1, 75);
        estudiante5.setNota(2, 68);
        estudiante5.setNota(3, 73);
        estudiante5.setNota(4, 55);

        System.out.println("Estudiante 1: " + estudiante1.getNombre());
        System.out.println("Promedio: " + estudiante1.calcularPromedio());
        System.out.println("Aprobado: " + (estudiante1.aprobado() ? "Sí" : "No"));
        System.out.println();

        System.out.println("Estudiante 2: " + estudiante2.getNombre());
        System.out.println("Promedio: " + estudiante2.calcularPromedio());
        System.out.println("Aprobado: " + (estudiante2.aprobado() ? "Sí" : "No"));
        System.out.println();

        System.out.println("Estudiante 3: " + estudiante3.getNombre());
        System.out.println("Promedio: " + estudiante3.calcularPromedio());
        System.out.println("Aprobado: " + (estudiante3.aprobado() ? "Sí" : "No"));
        System.out.println();

        System.out.println("Estudiante 4: " + estudiante4.getNombre());
        System.out.println("Promedio: " + estudiante4.calcularPromedio());
        System.out.println("Aprobado: " + (estudiante4.aprobado() ? "Sí" : "No"));
        System.out.println();

        System.out.println("Estudiante 5: " + estudiante5.getNombre());
        System.out.println("Promedio: " + estudiante5.calcularPromedio());
        System.out.println("Aprobado: " + (estudiante5.aprobado() ? "Sí" : "No"));
    }
}