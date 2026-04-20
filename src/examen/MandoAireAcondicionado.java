package examen;

public class MandoAireAcondicionado  extends MandosADistancia implements Ajustable{

    private int velocidad;  
    private modoAire modo = modoAire.FRIO; 
    //Temperatura sube de 1 en 1, entiendo temperatura cambia no sube y baja, introducir valor numerico
    private int temperatura; 

	public MandoAireAcondicionado(String modelo, double precio) {
		super(modelo, precio);
		this.temperatura = 10;
	}

	
    public int getVelocidad()      { return velocidad; }
    public void setVelocidad(int velocidad)      { this.velocidad = velocidad; }
    public int getTemperatura()      { return temperatura; }
    public void setTemperatura(int temperatura)      { this.temperatura = temperatura; }
   
    /**
     * Cambiar modo Aire 
     * @throws DispositivoApagadoException excepcion si esta apagado 
     */
    public void cambiarModo() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        modo = (modo == modoAire.FRIO) ? modoAire.CALOR : modoAire.FRIO;
    }

    /**
     * 
     * @param temp valor numerico de temperatura por la que cambiar 
     * @throws DispositivoApagadoException excepcion si esta apagado 
     */
    public void cambiarTemperatura(int temp) throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
    	if (temp > 0  && temp < 40) temperatura = temp; 
    }
    
    /**
     * Si el dispositivo esta apagado lanza una exception de dispositivo apagado 
     * sino sube 
     */
    @Override
    public void subir() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        velocidad += 5;
        if (velocidad > 5 ) velocidad = 5; 
    }

    /**
     * Si el dispositivo esta apagado lanza una exception de dispositivo apagado 
     * sino baja 
     */
    @Override
    public void bajar() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        velocidad -= 5;
        if (velocidad < 0) velocidad = 0;
    }

    @Override
    public String toString() {
        return "Mando Aire Acondicionado {" + super.toString() + ", velocidad= " + velocidad + ", modo= " + modo + ", temperatura= " + temperatura + "}";
    }
}

