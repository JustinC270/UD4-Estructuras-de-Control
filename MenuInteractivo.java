import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(hora);
        int opcion;
        do {
            System.out.println("--MENÚ--");
            System.out.println("1. Hora");
            System.out.println("2. Hora");
            System.out.println("3. Adiós");
            System.out.println("Elige: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("hola " + opcion);
                case 2 -> System.out.println(hora);
                case 3 -> System.out.println("Adios");
                default -> System.out.println("Opcion no válida");

            }
        } while (opcion != 3);
        sc.close();
    }
}
