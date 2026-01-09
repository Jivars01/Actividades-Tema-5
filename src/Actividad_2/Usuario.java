package Actividad_2;

import java.time.LocalDate;
import java.time.LocalDateTime;


/**
     * Clase Usuario que representa un usuario de una aplicación con un nombre de usuario,
     * contraseña, correo electrónico y fecha de inscripción.
     * @author ivanmorata
     * @version 1.0
     * @see LocalDate se ha utilizado para representar la fecha de inscripción
     */
    public class Usuario {
        private String nombre_usuario; /** Atributo de tipo String para almacenar el nombre de usuario */
        private String password;  /** Atributo de tipo String para almacenar la contraseña */
        private String email;  /** Atributo de tipo String para almacenar el correo electrónico */
        private LocalDateTime fechaInscripcion;  /** Atributo de tipo LocalDate para almacenar la fecha de inscripción */

        /**
         * Constructor por defecto que inicializa todos los atributos a vacío y/o nulo.
         */
        public Usuario(){
            nombre_usuario = password = email = "";
            fechaInscripcion = null;
        }

        /**
         * Constructor por parámetros de Usuario que inicializa el objeto con todos los atributos
         * @param nombre_usuario String que contiene el nombre de usuario
         * @param password String que contiene la contraseña de usuario
         * @param email String que contiene el correo electrónico del usuario
         * @param fechaInscripcion LocalDate con la fecha de inscripción del usuario
         */
        public Usuario(String nombre_usuario, String password, String email, LocalDateTime fechaInscripcion) {
            setNombre_usuario(nombre_usuario);
            setPassword(password);
            setEmail(email);
            setFechaInscripcion(fechaInscripcion);
        }

        public Usuario(String nombre_usuario, String password, String email, LocalDate fechaInscripcion){
            setNombre_usuario(nombre_usuario);
            setPassword(password);
            setEmail(email);
            this.fechaInscripcion.withYear(fechaInscripcion.getYear());
            this.fechaInscripcion.withMonth(fechaInscripcion.getMonthValue());
            this.fechaInscripcion.withDayOfMonth(fechaInscripcion.getDayOfMonth());
            this.fechaInscripcion.withHour(getFechaInscripcion().getHour());
            this.fechaInscripcion.withMinute(getFechaInscripcion().getMinute());
            this.fechaInscripcion.withSecond(getFechaInscripcion().getSecond());
        }

        /**
         * Constructor de copia para inicializar un usuario en base a otro
         * @param copia objeto de la clase Usuario a copiar
         */
        public Usuario(Usuario copia){
            this.nombre_usuario = copia.nombre_usuario;
            this.password = copia.password;
            this.email = copia.email;
            this.fechaInscripcion = LocalDateTime.from(copia.fechaInscripcion);
        }

        /**
         * Getter del nombre de usuario
         * @return el valor del atributo String nombre_usuario
         */
        public String getNombre_usuario() {
            return nombre_usuario;
        }

        /**
         * Setter del nombre de usuario. Deberá recibir por parámetros un valor no vacío.
         * @param nombre_usuario String con el valor a introducir al atributo nombre_usuario
         */
        public void setNombre_usuario(String nombre_usuario) {
            if(!nombre_usuario.isEmpty())
                this.nombre_usuario = nombre_usuario;
            else this.nombre_usuario = "";
        }

        /**
         * Getter de la contraseña del usuario
         * @return el valor del atributo String password
         */
        public String getPassword() {
            return password;
        }

        /**
         * Setter del nombre de la contraseña. Deberá contener al menos un caracter, una mayúscula y un número.
         * @param password String con el valor a introducir al atributo nombre_usuario
         */
        public void setPassword(String password) {
            if(contieneCaracter(password) && contieneMayuscula(password) && contieneNumero(password))
                this.password = password;
            else this.password = "";
        }

        /**
         * Getter del email
         * @return el valor del atributo String email
         */
        public String getEmail() {
            return email;
        }

        /**
         * Setter del nombre de email. Debe contener una @ y terminar con la cadena ".es" o ".com".
         * @param email String con el valor a introducir al atributo email
         */
        public void setEmail(String email) {
            if(email.contains("@") && (email.endsWith(".es") || email.endsWith(".com")))
                this.email = email;
            else this.email = "";
        }

        /**
         * Getter de la fecha de inscripción
         * @return el valor del atributo LocalDate fechaInscripcion
         */
        public LocalDateTime getFechaInscripcion() {
            return fechaInscripcion;
        }

        /**
         * Setter de la fecha de inscripción
         * @param fechaInscripcion LocalDate con el valor a introducir al atributo fechaInscripcion
         */
        public void setFechaInscripcion(LocalDateTime fechaInscripcion) {
            this.fechaInscripcion = LocalDateTime.from(fechaInscripcion);
        }

        /**
         * Metodo toString que devuelve el estado del objeto Usuario.
         * @return String con el estado actual del objeto this.
         */
        public String toString() {
            return "El usuario " + nombre_usuario + " tiene como contraseña " + password +
                    "\nSu correo es: " + email + "\n" +
                    "Y se inscribió en " + fechaInscripcion.toString();
        }

        public Usuario clone(){
        /*
        Usuario clon = new Usuario();
        clon.nombre_usuario = this.nombre_usuario;
        clon.password = this.password;
        clon.email = this.email;
        clon.fechaInscripcion = LocalDate.from(this.fechaInscripcion);*/
//        Usuario clon = new Usuario(this.nombre_usuario, this.password, this.email, this.fechaInscripcion);
            Usuario clon = new Usuario(this);
            return clon;
        }

        public boolean equals(Usuario otro){
        /*
        boolean iguales = true;
        if(!this.nombre_usuario.equals(otro.nombre_usuario))
            iguales = false;
        if(!this.password.equals(otro.password))
            iguales = false;
        if(!this.email.equals(otro.email))
            iguales = false;
        if(!this.fechaInscripcion.equals(otro.fechaInscripcion))
            iguales = false;
        return iguales;
        */
            if(this.nombre_usuario.equals(otro.nombre_usuario) && this.password.equals(otro.password) && this.email.equals(otro.email) && this.fechaInscripcion.equals(otro.fechaInscripcion))
                return true;
            else return false;
        }

        public String getañoinscripcion(){
            return Integer.toString(this.fechaInscripcion.getYear());

        }


        public int calcuantigüedad(){
            int resultado = 0;
            resultado=this.fechaInscripcion.minusYears(LocalDate.now().getYear()).getYear();
            return resultado;
        }
        private boolean contieneCaracter(String password){
            for(int i = 0; i < password.length(); i++){
                if(password.charAt(i) > 64 && password.charAt(i) < 123)
                    return true;
            }
            return false;
        }

        private boolean contieneMayuscula(String password){
            for(int i = 0; i < password.length(); i++){
                if(password.charAt(i) > 64 && password.charAt(i) < 91)
                    return true;
            }
            return false;
        }

        private boolean contieneNumero(String password){
            for(int i = 0; i < password.length(); i++){
                if(password.charAt(i) > 47 && password.charAt(i) < 58)
                    return true;
            }
            return false;
        }
    }

