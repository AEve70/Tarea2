package Tarea2;

class IOManager{
    static Scanner in = new Scanner(System.in);

    public static void print(String message){
        System.out.println(message);
    }

    public static int readInt(String message){
        print(message);
        return in.nextInt();
    }

}
