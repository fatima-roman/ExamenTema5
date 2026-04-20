package examen;

public class MandoAspiradora  extends MandosADistancia implements Ajustable{

    private int velocidad;  

	public MandoAspiradora(String modelo, double precio) {
		super(modelo, precio);
		this.velocidad = 1; 
	}

    public int getVelocidad()      { return velocidad; }
    public void setVelocidad(int volumen)      { this.velocidad = volumen; }
   
    
    @Override
    public void subir() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        velocidad += 1;
        if (velocidad > 3) velocidad = 3; 
    }

    @Override
    public void bajar() throws DispositivoApagadoException {
        if (!indicador) throw new DispositivoApagadoException();
        velocidad -= 1;
        if (velocidad < 0) velocidad = 0;
    }

    @Override
    public String toString() {
        return "Mando Aspiradora {" + super.toString() + ", velocidad= " + velocidad + "}";
    }
}
