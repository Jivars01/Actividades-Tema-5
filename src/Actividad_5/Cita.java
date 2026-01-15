package Actividad_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Cita {
    private String nombre;
    private String apellido;
    private String especialidad;
    private LocalTime tiempo;
    private LocalDate dia;

    public String getNombre() {
        return nombre;
    }

    public Cita(String nombre, String apellido, String especialidad, LocalTime tiempo, LocalDate dia) {
        setNombre(nombre);
        setApellido(apellido);
        setEspecialidad(especialidad);
        setTiempo(tiempo);
        setDia(dia);
    }
    public Cita(){
        nombre=apellido=especialidad="";
        tiempo = null;
        dia= null;
    }

    public void setNombre(String nombre) {
        boolean si = true;
        if(nombre.length()<=3){
            this.nombre="";
        }else this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if(apellido.isEmpty()){
            this.apellido = "";
        } else this.apellido = apellido;
        this.apellido.replace(" ", "");
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public LocalTime getTiempo() {
        return tiempo;
    }

    public void setTiempo(LocalTime tiempo) {
        this.tiempo = tiempo;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public void especialidades(String Especialidad){
        switch (Especialidad){
            case "Generalista":
                break;
            case "Traumatólogo":
                break;
            case "otorrinolaringólogo":
                break;
            case "cirujano":
                break;
            default:
                Especialidad = "";
        }


    }
}
