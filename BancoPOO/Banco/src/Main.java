import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();
        BancoConsulta consulta = new BancoConsulta();
        BancoDeposito deposito = new BancoDeposito();
        BancoRetiro retiro = new BancoRetiro();

        consulta.setSaldo(banco.getSaldo());
        deposito.setSaldo(banco.getSaldo());
        retiro.setSaldo(banco.getSaldo());

        int opcion;
        do {
            System.out.println("MENU BANCO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    consulta.setSaldo(banco.getSaldo());
                    consulta.consultar();
                    break;
                case 2:
                    deposito.setSaldo(banco.getSaldo());
                    deposito.depositar();
                    banco.setSaldo(deposito.getSaldo());
                    break;
                case 3:
                    retiro.setSaldo(banco.getSaldo());
                    retiro.retirar();
                    banco.setSaldo(retiro.getSaldo());
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema bancario.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
