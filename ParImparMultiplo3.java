import java.util.Scanner;

public class ParImparMultiplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce numero entero: ");
        int n = sc.nextInt();
        if (n % 2 == 0 && n % 3 == 0) { //Va a verificar si es entero y si es múltiplo de 3
            System.out.println("Par y multiplo de 3 " );
            
        } else if(n % 2 == 0){
            System.out.println("Par");
        } else if(n % 3 == 0){
            System.out.println("Impar y múltiplo de 3");
        } else {
            System.out.println("Impar");
        }
        sc.close();
    }
}
