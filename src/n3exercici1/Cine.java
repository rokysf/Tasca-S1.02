package n3exercici1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cine {
	private static Scanner sc = new Scanner(System.in);
	private int nombreFiles;
	private int nombreSeientsFila;
	private GestioButaques gestioButaques;

	public Cine() {
		this.gestioButaques = new GestioButaques();
		demanarDadesInicials();
	}

	public void iniciar() {
		byte opcio;
		do {
			opcio = menu();
			switch (opcio) {
			case 1:
				mostrarButaques(gestioButaques.getButaques());
				break;
			case 2:
				mostrarButaquesPersona(gestioButaques.getButaques());
				break;
			case 3:
				reservarButaca();
				break;
			case 4:
				anularReserva();
				break;
			case 5:
				anularReservaPersona(gestioButaques.getButaques());
				break;
			default:
				System.out.println("Fins aviat");
			}
		} while (opcio != 0);
	}

	public byte menu() {
		byte opcio;
		do {
			System.out.println("1.- Mostrar totes les butaques reservades.");
			System.out.println("2.- Mostrar les butaques reservades per una persona.");
			System.out.println("3.- Reservar una butaca.");
			System.out.println("4.- Anular la reserva d'una butaca.");
			System.out.println("5.- Anular totes les reserves d'una persona.");
			System.out.println("0.- Sortir.");
			opcio = sc.nextByte();
			sc.nextLine();
			if (opcio < 0 || opcio > 5) {
				System.out.println("L'opció escollida no es correcte");
			}
		} while (opcio < 0 || opcio > 5);
		return opcio;
	}

	public void mostrarButaques(ArrayList<Butaca> butaques) {
		if (butaques.size() == 0) {
			System.out.println("No hi han butaques introduides");
		} else {
			for (Butaca butaca : butaques) {
				System.out.println(butaca);
			}
		}
	}

	public void mostrarButaquesPersona(ArrayList<Butaca> butaques) {
		int contador = 0;
		String nom = "";
		do {
			try {
				nom = introduirPersona();
			} catch (ExcepcioNomPersonaIncorrecte e) {
				System.out.println(e.getMessage());
			}
		} while (nom == "");
		for (Butaca butaca : butaques) {
			if (nom.equalsIgnoreCase(butaca.getPersonaReservaButaca())) {
				System.out.println(butaca);
				contador++;
			}
		}
		System.out.println(nom + " te " + contador + (contador !=1 ? " butaques reservades" : " butaca reservada"));
	}

	public void reservarButaca() {
		int fila = 0;
		int seient = 0;
		String nom = "";

		do {
			try {
				fila = introduirFila();
			} catch (ExcepcioFilaIncorrecta e) {
				System.out.println(e.getMessage());
			}
		} while (fila == 0);

		do {
			try {
				seient = introduirSeient();
			} catch (ExcepcioSeientIncorrecte e) {
				System.out.println(e.getMessage());
			}
		} while (seient == 0);

		do {
			try {
				nom = introduirPersona();
			} catch (ExcepcioNomPersonaIncorrecte e) {
				System.out.println(e.getMessage());
			}
		} while (nom == "");

		Butaca butaca = new Butaca(fila, seient, nom);

		try {
			gestioButaques.afegirButaca(butaca);
		} catch (ExcepcioButacaOcupada e) {
			System.out.println(e.getMessage());
		}
	}

	public void anularReserva() {
		int fila = 0;
		int seient = 0;

		do {
			try {
				fila = introduirFila();
			} catch (ExcepcioFilaIncorrecta e) {
				System.out.println(e.getMessage());
			}
		} while (fila == 0);

		do {
			try {
				seient = introduirSeient();
			} catch (ExcepcioSeientIncorrecte e) {
				System.out.println(e.getMessage());
			}
		} while (seient == 0);

		Butaca butaca = new Butaca(fila, seient);
		
		try {
			gestioButaques.eliminarButaca(butaca);
		} catch (ExcepcioButacaLliure e) {
			System.out.println(e.getMessage());
		}
	}

	public void anularReservaPersona(ArrayList<Butaca> butaques) {
		String nom = "";
		boolean coincideix = false;
		if (butaques.size() == 0) {
			System.out.println("No hi han butaques introduides");
		} else {
			do {
				try {
					nom = introduirPersona();
				} catch (ExcepcioNomPersonaIncorrecte e) {
					System.out.println(e.getMessage());
				}
			} while (nom == "");

			Iterator<Butaca> iter = butaques.iterator();

			while (iter.hasNext()) {
				Butaca butaca = iter.next();
				if (nom.equalsIgnoreCase(butaca.getPersonaReservaButaca())) {
					System.out.println(butaca + " RESERVA ELIMINADA");
					iter.remove();
					coincideix = true;
				}
			}
			if (!coincideix) {
				System.out.println(nom + " no te cap reserva");
			}
		}
	}

	public String introduirPersona() throws ExcepcioNomPersonaIncorrecte {
		System.out.println("Introdueix el nom de la persona");
		String nom = sc.nextLine();
		if (nom.matches(".*[0-9].*")) {
			throw new ExcepcioNomPersonaIncorrecte("El nom de persona introduit es incorrecte");
		} else {
			return nom;
		}
	}

	public void demanarDadesInicials() {
		System.out.println("Quantes files te la sala de cinema?");
		this.nombreFiles = sc.nextInt();
		System.out.println("Quants seients per fila te la sala de cinema?");
		this.nombreSeientsFila = sc.nextInt();
		sc.nextLine();
	}

	public int introduirFila() throws ExcepcioFilaIncorrecta {
		System.out.println("Introdueix el nombre de fila");
		int fila = sc.nextInt();
		sc.nextLine();
		if (fila >= 1 && fila <= this.nombreFiles) {
			return fila;
		} else {
			throw new ExcepcioFilaIncorrecta("El nombre de fila introduit es incorrecte");
		}

	}

	public int introduirSeient() throws ExcepcioSeientIncorrecte {
		System.out.println("Introdueix el nombre de seient");
		int seient = sc.nextInt();
		sc.nextLine();
		if (seient >= 1 && seient <= this.nombreSeientsFila) {
			return seient;
		} else {
			throw new ExcepcioSeientIncorrecte("El nombre de seient introduit es incorrecte");
		}
	}

}
