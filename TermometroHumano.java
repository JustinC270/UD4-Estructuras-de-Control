import java.util.Scanner;
public class TermometroHumano {
    public static String termometroHumano(double grados) {
        if (grados < 0.0 || grados > 40.0) {
            return "Temperatura inválida";

        } else if (grados < 0) {
            return "Muy frío";
        } else if (grados < 0-10) {
            return "Frío";
        } else if (grados < 11-20) {
            return "Templado";
        } else if (grados < 21-30) {
            return "Calorcito";
        } else if (grados <30) {
            return "Calorazo";
        }
        
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce una temepertura: ");
    double tempertura = sc.nextDouble();
    
}
