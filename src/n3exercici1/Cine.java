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

		menu();
		switch (menu()) {
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

			break;
		case 5:

			break;
		default:
			System.out.println("Fins aviat");

		}

	}

	public byte menu() {
		byte opcio;
		do {
			System.out.println("1.- Mostrar totes les butaques reservades.");
			System.out.println("2.- Mostrar les butaques reservades per una persona.");
			System.out.println("3.- Reservar una butaca.");
			System.out.println("4.- Anul·lar la reserva d’una butaca.");
			System.out.println("5.- Anul·lar totes les reserves d’una persona.");
			System.out.println("0.- Sortir.");
			opcio = sc.nextByte();
			if (opcio < 0 || opcio > 5) {
				System.out.println("L'opció escollida no es correcte");
			}
		} while (opcio < 0 || opcio > 5);
		return opcio;
	}

	public void mostrarButaques(ArrayList<Butaca> butaques) {
		for (Butaca butaca : butaques) {
			System.out.println(butaca);
		}
	}

	public void mostrarButaquesPersona(ArrayList<Butaca> butaques) {
		int contador = 0;
		System.out.println("Introdueix el nom de la persona que ha fet la reserva");
		String nombre = sc.nextLine();
		for (Butaca butaca : butaques) {
			if (nombre.equalsIgnoreCase(butaca.getPersonaReservaButaca()))
				;
			System.out.println(butaca);
			contador++;
		}
		System.out.println(nombre + " te " + contador + " butaques reservades");
	}

	public void reservarButaca() {
		int fila = 0;
		int seient = 0;
		String nom = "";

		try {
			fila = introduirFila();
		} catch (ExcepcioFilaIncorrecta e) {
			System.out.println(e.getMessage());
		}
		try {
			seient = introduirSeient();
		} catch (ExcepcioSeientIncorrecte e) {
			System.out.println(e.getMessage());
		}
		try {
			nom = introduirPersona();
		} catch (ExcepcioNomPersonaIncorrecte e) {
			System.out.println(e.getMessage());
		}

		Butaca butaca = new Butaca(fila, seient, nom);
		try {
			gestioButaques.afegirButaca(butaca);
		} catch (ExcepcioButacaOcupada e) {
			System.out.println(e.getMessage());
		}
	}

	public void anularReserva() {

	}

	public void anularReservaPersona() {

	}

	public String introduirPersona() throws ExcepcioNomPersonaIncorrecte {
		System.out.println("Introdueix el nom de la persona que vol fer la reserva ");
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
	}

	public int introduirFila() throws ExcepcioFilaIncorrecta {
		System.out.println("Introdueix el nombre de fila");
		int fila = sc.nextInt();
		if (fila >= 1 && fila <= this.nombreFiles) {
			return fila;
		} else {
			throw new ExcepcioFilaIncorrecta("El nombre de fila introduit es incorrecte");
		}
	}

	public int introduirSeient() throws ExcepcioSeientIncorrecte {
		System.out.println("Introdueix el nombre de seient");
		int seient = sc.nextInt();
		if (seient >= 1 && seient <= this.nombreSeientsFila) {
			return seient;
		} else {
			throw new ExcepcioSeientIncorrecte("El nombre de seient introduit es incorrecte");
		}
	}

}
