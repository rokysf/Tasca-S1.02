package n3exercici1;

public class Butaca {

	private int nombreFila;
	private int nombreSeient;
	private String personaReservaButaca;
	
	public Butaca(int nombreFila, int nombreSeient, String personaReservaButaca) {
		this.nombreFila = nombreFila;
		this.nombreSeient = nombreSeient;
		this.personaReservaButaca = personaReservaButaca;
	}

	public int getNombreFila() {
		return nombreFila;
	}

	public int getNombreSeient() {
		return nombreSeient;
	}

	public String getPersonaReservaButaca() {
		return personaReservaButaca;
	}

	public void equals() {
		
	}

	@Override
	public String toString() {
		return "Butaca [Fila=" + nombreFila + ", Seient=" + nombreSeient + ", Persona="	+ personaReservaButaca + "]";
	}

	

}
