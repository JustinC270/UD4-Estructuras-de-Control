import java.util.Scanner; 
public class Calificacion {     
    public String obtenerCalificacion(double valor) {     
        if (valor < 0.0 || valor > 10.0) {            
            return "Nota invalida";         
        } else if (valor < 5) {             
            return "Suspenso";        
        } else if (valor < 6) {            
            return "Aprobado";        
        } else if (valor < 7) {            
            return "Bien";         
        } else if (valor < 9) {             
            return "Notable";         
        } else{             
            return "Sobresaliente";         
     }     
}    
    public static void main(String[] args) {       
         Calificacion programa = new Calificacion();       
            Scanner sc = new Scanner(System.in);        
            System.out.print("Introduce tu nota: ");        
            double nota = sc.nextDouble();         
            String calificacion = programa.obtenerCalificacion(nota);        
            System.out.println("calificación: " + calificacion);   
            sc.close();
     } 
}  