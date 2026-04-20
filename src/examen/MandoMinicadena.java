package examen;

public class MandoMinicadena  extends MandosADistancia implements Ajustable{

    private int volumen;  

	public MandoMinicadena(String modelo, double precio) {
		super(modelo, precio);
		this.volumen = 10; 
	}

    public int getVolumen()      { return volumen; }
    public void setVolumen(int volumen)      { this.volumen = volumen; }
   
    /**
     * Lanza excepcion y sube o baja volumen
     */
    @Override
    public void subir() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        volumen += 10;
    }

    @Override
    public void bajar() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        volumen -= 10;
        if (volumen < 0) volumen = 0;
    }

    @Override
    public String toString() {
        return "Mando Minicadena {" + super.toString() + ", volumen= " + volumen + "}";
    }
}
