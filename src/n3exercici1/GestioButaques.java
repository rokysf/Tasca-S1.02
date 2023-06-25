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
		int resultado = cercarButaca(butaca);
		if (resultado == -1) {
			this.butaques.add(butaca);
			System.out.println("La butaca s'afegit correctament");
		} else {
			throw new ExcepcioButacaOcupada("La butaca que es vol afegir, ja està ocupada");
		}

	}

	public void eliminarButaca(Butaca butaca) throws ExcepcioButacaLliure {
		int resultado = cercarButaca(butaca);
		if (resultado != -1) {
			butaques.remove(resultado);
			System.out.println("La butaca s'ha eliminat correctament");
		} else {
			throw new ExcepcioButacaLliure("La butaca que es vol eliminar, està lliure");
		}
	}

	public int cercarButaca(Butaca butaca) {
		int i = 0;
		
		while (i < butaques.size() && !butaques.get(i).equals(butaca)) {
			if (!butaques.get(i).equals(butaca)) {
				i++;
			}
		}
		if (i == butaques.size()) {
			i = -1;
		}
		return i;
	}

}
