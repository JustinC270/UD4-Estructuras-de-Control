import java.util.Scanner;

public class NotaPorLetra {
    public String notaPorLetra (String nota) {
        Scanner sc = new Scanner (System.in);
        return  switch (nota) {
            case "A" -> "Sobresaliente";
            case "B" -> "Notable";
            case "C" ->  "Bien";
            case "D" ->  "Suficiente";
            case "F" -> "Insuficiente";
            default -> "Letra inválida"; 
     };
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letra = sc.nextLine();
         System.out.println(letra.toUpperCase());
    }
}
