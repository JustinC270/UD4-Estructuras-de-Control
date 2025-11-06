import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(hora);
        int opcion;
        do{
            System.out.println("--MENÚ--");
            System.out.println("1. Hora");
            System.out.println("2. Hora");
            System.out.println("3. Adiós");
            System.out.println("Elige: ");
        } while  (opcion)
    }
}

