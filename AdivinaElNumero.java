import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 0;
        int secreto = MIN + new Random().nextInt(MAX - MIN + 1);
        System.out.println("Estoy pensando un número del " + MIN  + " al " + MAX);
        int intentos= 0;
        try (Scanner sc = new Scanner(System.in)){
        do {
            System.out.println("Tu intento: " );
            String number = sc.nextLine();
            intentos = Integer.parseInt(number);
            if (intentos > MIN && intentos < MAX) {
                if (intentos < secreto) {
                    System.out.println("Mayor");
                
                } else if (intentos > secreto) {
                    System.out.println("Menor");
                }
                intentos++;
            }else {
                System.out.println("Número no válido");
            }
            }while (intentos != secreto);
            
            System.out.printf("¡Adivinaste en " + intentos +  " intentos!");
            }
            
        catch (NumberFormatException e) {
                System.out.println("Dato no válido");
            
        }
    }
}   

