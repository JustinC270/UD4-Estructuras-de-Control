import java.util.Scanner;

public class LoopMaster {
    public static void contarHastaN(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        System.out.println("..................");
    }



    public static void imprimirSumaHastaN(int n){
        int suma =0;
        for (int i = 1; i <=n; i++) {
            suma+= i;
        }
            System.out.println("Suma = " + suma);
            System.out.println("..................");

    }

    public static void imprimirTablaMultiplicar(int n){
        for (int i = 1; i <= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                
            
            System.out.printf(" %d * %d = %d%n", i,a,i *a);
            }
        }   
            System.out.println("..................");

    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    }
}
