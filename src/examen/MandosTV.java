package examen;

public class MandosTV  extends MandosADistancia implements Ajustable{

	private int canal;
    private int volumen;  

	public MandosTV(String modelo, double precio) {
		super(modelo, precio);
		this.canal = 1; 
		this.volumen = 5; 
	}

    public int getCanal() { return canal; }
    public int getVolumen()      { return volumen; }
    public void setCanal(int canal) { this.canal = canal; }
    public void setVolumen(int volumen)      { this.volumen = volumen; }
   
    
    /**
     * Cambiar canal introduciendo numero int 
     * @param canalc canal a cambiar 
     * @throws DispositivoApagadoException si esta apagado
     */
    public void cambiarCanal(int canalc) throws DispositivoApagadoException{
    	if (!indicador) throw new DispositivoApagadoException();
    	if (canalc > 0 ) canal = canalc; 
    }
    
    @Override
    public void subir() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        volumen += 5;
        if (volumen > 100 ) volumen = 100; 
    }

    @Override
    public void bajar() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        volumen -= 5;
        if (volumen < 0) volumen = 0;
    }

    @Override
    public String toString() {
        return "Mando TV {" + super.toString() + ", canal= " + canal + ", volumen= " + volumen + "}";
    }
}
