public class SecureUser {
    private String userName;
    private String password;
    public SecureUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        if(userName!=null){
            this.userName = userName;
        }else{
            System.out.println("Ingresa un usuario valido");
        }
        
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
    if (password.length() < 8) {
        System.out.println("Ingresa una contraseña de al menos 8 caracteres.");
        return;
    }

    boolean upperCase = false;
    boolean lowerCase = false;
    boolean digit = false;
    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);
        if (Character.isUpperCase(c)) {
            upperCase = true;
        } else if (Character.isLowerCase(c)) {
            lowerCase = true;
        } else if(Character.isDigit(c)){
            digit = true;
        }
    }

    if (upperCase && lowerCase && digit) {
        this.password = password;
        System.out.println("Acceso concedido");
    } else {
        System.out.println("Acceso denegado");
    }
}
    public boolean userAuthentication(String intentPassword){
        if(intentPassword.equals(password)){
            return true;
        }else {
            return false;
        }

    }


}

