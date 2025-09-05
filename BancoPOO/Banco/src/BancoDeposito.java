import java.util.Scanner;

public class BancoDeposito extends Banco {
    public void depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuanto deseas depositar? ");
        double cantidad = sc.nextDouble();
        setSaldo(getSaldo() + cantidad);
        System.out.println("Deposito exitoso. Nuevo saldo: $" + getSaldo());
    }
}
