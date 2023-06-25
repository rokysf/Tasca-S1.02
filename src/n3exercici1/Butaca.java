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

	public Butaca(int nombreFila, int nombreSeient) {
		this.nombreFila = nombreFila;
		this.nombreSeient = nombreSeient;
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

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Butaca other = (Butaca) obj;
		if (this.nombreFila != other.nombreFila) {
			return false;
		}
		if (this.nombreSeient != other.nombreSeient) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Butaca [Fila=" + nombreFila + ", Seient=" + nombreSeient + ", Persona=" + personaReservaButaca + "]";
	}

}
