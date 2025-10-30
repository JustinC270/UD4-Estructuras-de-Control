import java.util.Scanner;

public class LoopMaster {
    public static void contarHastaN(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i + " ");
        }
    }



    public static void imprimirSumaHastaN(int n){
        int suma =0;
        while (suma < n) {
            System.out.println(suma);
            suma++; 
        }
        System.out.println("Suma= " + suma);
    }



    public static void imprimirTablaMultiplicar(int n){

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número ");
    }
}
