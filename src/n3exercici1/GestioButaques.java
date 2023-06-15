package n3exercici1;

import java.util.ArrayList;

public class GestioButaques {

	private ArrayList<Butaca> butaques;

	public GestioButaques() {

		this.butaques = new ArrayList<Butaca>();

	}

	public ArrayList<Butaca> getButaques() {
		return butaques;
	}

	public void afegirButaca(Butaca butaca) throws ExcepcioButacaOcupada {
		int resultado = cercarButaca(butaca.getNombreFila(), butaca.getNombreSeient());
		if (resultado == -1) {
			this.butaques.add(butaca);
			System.out.println("La butaca s'afegit correctament");
		} else {
			throw new ExcepcioButacaOcupada("La butaca que es vol afegir, ja està ocupada");
		}

	}

	public void eliminarButaca(int nombreFila, int nombreSeient) throws ExcepcioButacaLliure {
		int resultado = cercarButaca(nombreFila, nombreSeient);
		if (resultado != -1) {
			butaques.remove(resultado);
			System.out.println("La butaca s'ha eliminat correctament");
		} else {
			throw new ExcepcioButacaLliure("La butaca que es vol eliminar, està lliure");
		}
	}

	public int cercarButaca(int nombreFila, int nombreSeient) {
		int i = 0;
		boolean encontrado = false;
		while (i < butaques.size() && !encontrado) {
			if (butaques.get(i).getNombreFila() == nombreFila && butaques.get(i).getNombreSeient() == nombreSeient) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (!encontrado) {
			i = -1;
		}
		return i;
	}

}
