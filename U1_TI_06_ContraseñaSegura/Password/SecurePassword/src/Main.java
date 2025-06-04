import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Ingresa el usuario:");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println("Ingresa la contrasena:");
        String password = sc.nextLine();
        System.out.println("Ingresa la contrasena de nuevo...");
        String auth = sc.nextLine();



 SecureUser su = new SecureUser(user, password);
 su.setUserName(user);
 su.setPassword(password);
 if(su.userAuthentication(auth)){
        System.out.println("Acceso concedido");
} else {
    System.out.println("Acceso denegado");
}
 
    }
}
