class Calificacion {

    public String obtenerCalificacion(double valor) {
        
        return "Nota inválida";
    }

    public static void main(String[] args) {
        Calificacion programa = new Calificacion();
        // Pedir nota por pantalla
        double nota = 0.0;
        String calificacion = programa.obtenerCalificacion(nota);
        // Mostrar calificacion
        System.out.println(calificacion);
    }
}