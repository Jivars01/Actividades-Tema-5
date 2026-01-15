package Actividad_6;

import java.time.LocalDate;

public class Vehiculo {
    private int ruedas;
    private int velocidad;
    private int velocidadmax;
    private LocalDate Antigüedad;

    public Vehiculo(int ruedas, int velocidad, int velocidadmax, LocalDate antigüedad) {
        this.ruedas = ruedas;
        this.velocidad = velocidad;
        this.velocidadmax = velocidadmax;
        Antigüedad = antigüedad;
    }

    public Vehiculo(){
        ruedas = velocidad = velocidadmax = 0;
        Antigüedad = null;
    }

    public Vehiculo(Vehiculo otro){
        this.ruedas = otro.ruedas;
        this.velocidad = otro.velocidad;
        this.velocidadmax = otro.velocidadmax;
        this.Antigüedad = LocalDate.from(otro.Antigüedad);
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(int velocidadmax) {
        this.velocidadmax = velocidadmax;
    }

    public LocalDate getAntigüedad() {
        return Antigüedad;
    }

    public void setAntigüedad(LocalDate antigüedad) {
        Antigüedad = antigüedad;
    }

    @Override
    public String toString() {
        return "El vehiculo con un numero total de ruedas " + ruedas + "Con una velocidad normal de "
                + velocidad + "de una velocidad maxima de " + velocidadmax + "Con una antigüedad de " + Antigüedad + " Esta creado";
    }
    public void frenar(){

    }
}
