import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("Hola mundo");
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre?: ");
        String nombre = sc.nextLine();
        System.out.println("Adiós " +nombre+"!");
    }
}
