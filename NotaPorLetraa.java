import java.util.Scanner;
 
public class NotaPorLetra {
public static String obtenerNota(char letra) {
        return switch (letra) {
            case 'A' -> "Sobresaliente";
            case 'B' -> "Notable";
            case 'C' -> "Bien";
            case 'D' -> "Suficiente";
            case 'F' -> "Insuficiente";
            default -> "Letra inválida";
        };
    }
}
 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Muestranos tu nota: ");
    String texto = sc.next().trim(); //Quita el espacio en blanco de adelante
        if(texto.length()> 1 ){ //Compruebo si por pantalla introduce más de un carácter
    System.out.println("Debes introducir un sólo carácter");
        }else {
    String nota =  NotaPorLetra.obtenerNota(texto.toUpperCase().charAt(0));
    System.out.println("Nota: " + nota);
    sc.close();
    }
}