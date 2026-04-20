package examen;

public interface Ajustable {
	/**
	 * 	Subir y bajar 
	 * @throws DispositivoApagadoException Si Apagado
	 */
    void subir() throws DispositivoApagadoException;
    void bajar() throws DispositivoApagadoException;
}