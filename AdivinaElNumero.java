import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        final int MIN = 0;
        int secreto = MIN + new Random().nextInt(MAX - MIN + 1);
        System.out.println("Estoy pensando un número del " + MIN  + " al " + MAX);
        int intentos;
        while (true) {
            int numero = sc.nextInt();
            System.out.println("Tu intento: " + numero);
        }   
    }
}