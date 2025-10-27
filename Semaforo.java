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
            case "Rojo" -> "Para";
            case "Verde" -> "Pasar";
            case "Amarillo" -> "Atento";
            default -> "Color inválido";
                
        };        
    }

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        String resultado = semaforo.accionSemaforoIf("Rojo");
        System.out.println(resultado);
        String resultado1 = semaforo.accionSemaforoIf("Verde");
        System.out.println(resultado1);
        String resultado2 = semaforo.accionSemaforoIf("Amarillo");
        System.out.println(resultado2);
        // Pedir color al usuario usando Scanner
        // Llamar a método accionSemaforoIf
        // Mostrar por pantalla (System.out) el resultado
        // Llamar a método accionSemaforoSwitch
        // Mostrar por pantalla (System.out) el resultado
    }
} 

