package Actividad_6;

import java.time.LocalDate;

public class Coche extends Vehiculo{
        private String tipoCombustible;

        public Coche(){
            super();
            tipoCombustible = "";
        }

        public Coche(int nRuedas, int velocidad, int velocidadMaxima, LocalDate antigüedad, String tipoCombustible) {
            super(nRuedas, velocidad, velocidadMaxima, antigüedad);
            this.setTipoCombustible(tipoCombustible);
        }

        public Coche(Coche otro) {
            super(otro);
            this.tipoCombustible = otro.tipoCombustible;
        }

        public String getTipoCombustible() {
            return tipoCombustible;
        }

        public void setTipoCombustible(String tipoCombustible) {
            this.tipoCombustible = tipoCombustible;
        }

        public String toString(){
            return "Este coche es " + super.toString();
    }
}
