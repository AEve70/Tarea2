package Resources;
import java.util.Scanner;

public class IOManager{
    static Scanner in = new Scanner(System.in);
    
    public static void print(String message){
        System.out.println(message);
    }

    public static int readInt(String message){
        print(message);
        return in.nextInt();
    }

    public static String readString(String message){
        print(message);
        return in.nextLine();
    }

}
