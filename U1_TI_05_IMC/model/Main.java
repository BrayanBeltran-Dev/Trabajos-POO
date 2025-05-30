import model.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la altura (en metros): ");
        Double altura = scanner.nextDouble();

        System.out.print("Ingrese el peso (en kilogramos): ");
        Double peso = scanner.nextDouble();

        Persona persona = new Persona(nombre, altura, peso);

        double imc = persona.calcularIMC();

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Altura: " + persona.getAltura());
        System.out.println("Peso: " + persona.getPeso());
        System.out.printf("IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Clasificación: Normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }

        scanner.close();
    }
}

