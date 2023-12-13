package Ejercicio1;

public class EjercicioExamen {
    public static void main(String[] args) {
        Examen e1 = new Examen("Tema 1 - ", 8.5);
        Examen e2 = new Examen("Tema 1 - ", 8.5);
        Examen e3 = new Examen("Tema 1 - ", 8.5);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
    private void Aprobado(Examen examen){
        if(Examen.estaAprobado()>=5){
            System.out.println("Aprobado");
        }
        System.out.println("Suspenso");
    }
}
