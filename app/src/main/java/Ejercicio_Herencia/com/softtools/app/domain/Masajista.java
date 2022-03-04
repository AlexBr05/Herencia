package Ejercicio_Herencia.com.softtools.app.domain;

public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(){

    }

    public Masajista(String titulacion, int aniosExperiencia, String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }


    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista [aniosExperiencia=" + aniosExperiencia + ", titulacion=" + titulacion +
         " "+ super.toString()+ "]";
    }
    
    
}
