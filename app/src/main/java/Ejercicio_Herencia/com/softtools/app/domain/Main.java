package Ejercicio_Herencia.com.softtools.app.domain;

public class Main {
    public static void main(String[] args) {

        SeleccionFutbol seleccion = new SeleccionFutbol("Alex", "Lopez", 23);
        System.out.println(seleccion);
        System.out.println("*************Futbolista*****************");
        Futbolista futbolista = new Futbolista(1,"Portero","Gustavo", "Briones", 23);
        System.out.println(futbolista);
        System.out.println("*************Masajista*****************");
        Masajista masajista = new Masajista("Lic. en Ortopedía", 2,"Daniel", "Salvador", 23);
        System.out.println(masajista);
        System.out.println("*************Entrenador*****************");
        Entrenador entrenador = new Entrenador("Alberto", "Reyes", 22);
        System.out.println(entrenador);
        Entrenador entrenador2 = new Entrenador("Cesar", "Perez", 22);
        System.out.println(entrenador2);

    }

}
