package Main;

import java.util.Arrays;

import examen.DispositivoApagadoException;
import examen.MandoAireAcondicionado;
import examen.MandoAspiradora;
import examen.MandoMinicadena;
import examen.MandosADistancia;
import examen.MandosTV;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
	    System.out.println("\n=== CREAR MANDOS Y ORDENAR POR PRECIO ===");
    MandosTV tv = new MandosTV("Echo Dot", 59.99);
    MandoMinicadena minicadena= new MandoMinicadena("Hue White", 24.99);
    MandoAspiradora aspiradora= new MandoAspiradora("Nest", 199.99);
    MandoAireAcondicionado aire= new MandoAireAcondicionado("C200", 39.99);
    MandosTV tv2 = new MandosTV("NOC", 19.99);

    MandosADistancia[] catalogo = { tv, minicadena, aspiradora, aire, tv2 };
    

    	Arrays.sort(catalogo);
    	
    for (MandosADistancia d : catalogo) {
        System.out.println(d);
    }
    
    System.out.println("\n=== ACCIONES ===");
    for (MandosADistancia d : catalogo) {
        d.encender();
        try {
            if (d instanceof MandosTV) {
            	MandosTV a = (MandosTV) d;
                a.subir(); a.subir();
                a.cambiarCanal(5);
                System.out.println(a);

            } else if (d instanceof MandoMinicadena) {
            	MandoMinicadena l = (MandoMinicadena) d;
                l.subir(); l.bajar();
                System.out.println(l);

            } else if (d instanceof MandoAspiradora) {
            	MandoAspiradora t = (MandoAspiradora) d;
                t.subir(); 
                t.bajar();
                System.out.println(t);

            } else if (d instanceof MandoAireAcondicionado) {
            	MandoAireAcondicionado c = (MandoAireAcondicionado) d;
                c.cambiarModo();
                c.cambiarTemperatura(28);
                c.subir(); c.bajar();
                System.out.println(c);
            }

        } catch (DispositivoApagadoException e) {
            System.out.println(e);
        } catch (Exception e ) {
        	System.out.println("Error inesperado: " + e);
        }
    }

    System.out.println("\n=== PRUEBA ERROR ===");
    tv.apagar();
    try {
        tv.subir();  
    } catch (DispositivoApagadoException e) {
        System.out.println(e);
    }
}

}



