package examen;

abstract public class MandosADistancia implements Comparable<MandosADistancia> {
	
	protected String modelo;
	protected double precio; 
	protected boolean indicador; 

    public MandosADistancia(String modelo, double precio) {
        setModelo(modelo);
        setPrecio(precio);
        this.indicador = false;  // todos empiezan apagados
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isIndicador() {
		return indicador;
	}
	
	
	/**
	 * Encender y apagar dispositivos
	 */
    public void encender() { indicador = true; }
    public void apagar()   { indicador = false; }
    
    
    @Override
    public int compareTo(MandosADistancia otro) {
        return Double.compare(this.precio, otro.precio);  
    }
    
    
    // DOs mandos son igaules si mismo modelo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MandosADistancia)) return false; 
        MandosADistancia otro = (MandosADistancia) obj;      
        return modelo.equals(otro.modelo);
    }
    
    @Override
    public String toString() {
        return "modelo=" + modelo
                + ", precio=" + precio + ", encendido=" + indicador;
    }
}
