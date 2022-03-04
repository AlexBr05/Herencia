package Ejercicio_Herencia.com.softtools.app.domain;


public class SeleccionFutbol {
    
    protected String nombre;
    protected String apellidos;
    protected int edad;


    public SeleccionFutbol(){

    }

    public SeleccionFutbol(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol [apellidos=" + apellidos + ", edad=" + edad + ", nombre=" + nombre + "]";
    }

    
}
