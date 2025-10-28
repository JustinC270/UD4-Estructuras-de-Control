    import java.util.Scanner;

    public class DiaDeLaSemana {
        public static String obtenerDia (int numero) {
            return switch (numero){
                case '1'-> "Lunes";
                case '2' -> "Martes";
                case '3' -> "Miercoles";
                case '4' -> "Jueves";
                case '5' -> "Viernes";
                case '6' -> "Sábado";
                case '7' -> "Domingo";
                default -> "Número inválido";
                };
            }
        }

        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un dia de la semana: ");
            int dia = sc.nextInt();
            System.out.println(dia);
            
            
    }

  