package Actividad_6;

import java.time.LocalDate;

public class Motocicleta extends Vehiculo{
    //Motocicleta: puede ser un ciclomotor o scooter.
    private String tipoMotocicleta;

    public Motocicleta(){
        super();
        tipoMotocicleta= "";
    }

        public Motocicleta(int nRuedas, int velocidad, int velocidadMaxima, LocalDate antigüedad, String tipoMotocicleta) {
        super(nRuedas,velocidad,velocidadMaxima,antigüedad);
        this.setTipoMotocicleta(tipoMotocicleta);
    }

    public Motocicleta(Motocicleta otro) {
        super(otro);
        this.tipoMotocicleta = otro.tipoMotocicleta;
    }

    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public String toString(){
        return "Este coche es " + super.toString();
    }
}
