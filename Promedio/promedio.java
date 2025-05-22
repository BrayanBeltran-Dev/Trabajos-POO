import javax.swing.JOptionPane;

public class promedio{
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Ingresa el primer numero");
            System.out.println("El numero es:" + numero1);
        String numero2 = JOptionPane.showInputDialog("Ingresa otro numero");
            System.out.println("El numero es:" + numero2);
        String numero3 = JOptionPane.showInputDialog("Ingresa otro numero");
            System.out.println("El numero es:" + numero3);

        System.out.println("El promedio es:" +(Integer.parseInt(numero1) + Integer.parseInt(numero2) + Integer.parseInt(numero3))/3);

    }
}