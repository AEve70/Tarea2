package Ejercicio8;

import Resources.IOManager;

public class PasswordValidator {
    public static void main(String [] args){
        String password = IOManager.readString("Provide a password:");
        
        //Corregir 
        while(true){
            if(password.length() < 8){
                IOManager.print("Password must be at least 8 characters long.");
            } else if (!password.matches(".*[A-Z].*")) { 
                IOManager.print("Password must contain at least one uppercase letter.");
            } else {
                IOManager.print("Password is valid.");
                break;
            }
            password = IOManager.readString("Provide a password:");

        }

        
    }
}
