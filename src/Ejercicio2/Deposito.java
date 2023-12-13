package Ejercicio2;

public class Deposito {
    private int aceite;
    private int agua;
    private int gasoleo;
    private int gasolina;
    private int capacidad;

    public Deposito() {
        this.capacidad = capacidad;
    }

    public Deposito(int aceite, int agua, int gasoleo, int gasolina, int capacidad) {
        this.aceite = aceite;
        this.agua = agua;
        this.gasoleo = gasoleo;
        this.gasolina = gasolina;
        this.capacidad = capacidad;
    }

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getGasoleo() {
        return gasoleo;
    }

    public void setGasoleo(int gasoleo) {
        this.gasoleo = gasoleo;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    @Override
    public String toString() {
        return "Deposito{" +
                "aceite=" + aceite +
                ", agua=" + agua +
                ", gasoleo=" + gasoleo +
                ", gasolina=" + gasolina +
                '}';
    }

    public int estaVacio(){

    }
    public int llenar(){

    }
    public int extraer(){

    }
    public int getPorcentaje(){

    }
    public int trasvasar(){

    }

    public int dibujar(){

    }
}
