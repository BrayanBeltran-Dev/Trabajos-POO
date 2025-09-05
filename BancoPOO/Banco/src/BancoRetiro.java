import java.util.Scanner;

public class BancoRetiro extends Banco {
    public void retirar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuanto deseas retirar? ");
        double cantidad = sc.nextDouble();
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
            System.out.println("Retiro exitoso. Nuevo saldo: $" + getSaldo());
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
