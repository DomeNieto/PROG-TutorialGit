import java.util.Scanner;

public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int askNumber = scanner.nextInt();

    System.out.println("Hola, Mundo!. Tu numero es: " + askNumber);

    scanner.close();
}
}