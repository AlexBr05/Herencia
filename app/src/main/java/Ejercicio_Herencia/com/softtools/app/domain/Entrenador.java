package Ejercicio_Herencia.com.softtools.app.domain;

public class Entrenador extends SeleccionFutbol{
    private int idFederacion;
     
    private static int contadorEntrenador;
    
    
    public Entrenador(String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
        this.idFederacion = ++Entrenador.contadorEntrenador;
    }


    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador [idFederacion=" + idFederacion + 
        " "+ super.toString() +"]";
    }

    
    
}
