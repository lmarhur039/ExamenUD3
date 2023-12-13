package Ejercicio1;

public class Examen {
    private String Titulo;
    private double calificacion;
    public static String Asignatura;

    public Examen(String titulo, double calificacion) {
        Titulo = titulo;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setClasificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "Titulo='" + Titulo + '\'' +
                ", clasificacion=" + calificacion +
                '}';
    }

    public int Redondear(){
        Math.round(); }

    public static boolean estaAprobado(){
        if (this.calificacion>=5){
            return true;
        }

        return false;
    }
}
