public class BancoConsulta extends Banco {
    public void consultar() {
        System.out.println("Tu saldo actual es: $" + getSaldo());
    }
}
