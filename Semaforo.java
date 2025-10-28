import java.util.Scanner;
public class Semaforo {


    public String accionSemaforoIf(String color) {
        if (color.equals("Rojo")) {
            return "Parar";
        } else if (color.equals("Verde")) {
            return "Pasar";
        } else if (color.equals("Amarillo")) {
            return "Atento";
        }

        return accionSemaforoIf(color);
        
    }

    public String accionSemaforoSwitch(String color){
        return switch (color) {
            case "Rojo" -> "Parar";
            case "Verde" -> "Pasar";
            case "Amarillo" -> "Atento";
            default -> "Color inválido";
                
        };        
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un color: " );
        String color = sc.nextLine();
        System.out.println(semaforo.accionSemaforoIf(color));
        System.out.println(semaforo.accionSemaforoSwitch(color));


        // Pedir color al usuario usando Scanner
        // Llamar a método accionSemaforoIf
        // Mostrar por pantalla (System.out) el resultado
        // Llamar a método accionSemaforoSwitch
        // Mostrar por pantalla (System.out) el resultado
        sc.close();
    }
} 

