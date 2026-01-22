package Ejercicio8;

import Resources.IOManager;

public class PasswordValidator {
    public static void main(String [] args){
        String password = IOManager.readString("Provide a password:");
        
        while(true){
           boolean isValid = true;

           if(!isMinLength(password)){
               IOManager.print("Password must be at least 8 characters long.");
                isValid = false;
           } 

           if(!itHasUppercase(password)){
                IOManager.print("Password must contain at least one uppercase letter.");
                isValid = false;
           }

           if(isValid) {
                IOManager.print("Password is valid");
                break;
           }

            password = IOManager.readString("Provide a password:");

        }

        
    }
    public static boolean isMinLength(String password){
        return password.length() >= 8;
    }

    public static boolean itHasUppercase(String password){
        return password.matches(".*[A-Z].*");
    }
}


