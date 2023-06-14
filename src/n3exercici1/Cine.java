package n3exercici1;

import java.util.Scanner;

public class Cine {
	private static Scanner sc = new Scanner(System.in);
	private int nombreFiles;
	private int nombreSeients;
	private GestioButaques gestioButaques;

	public Cine() {
		this.gestioButaques = new GestioButaques();
		demanarDadesInicials();

	}

	public void iniciar() {
		
			menu();
		
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

	
	public void mostrarButaques() {
		
	}
	
	public void mostrarButaquesPersona() {
		
	}
	
	public void reservarButaca() {
		
	}
	
	public void anularReserva() {
		
	}
	
	public void anularReservaPersona() {
		
	}
	
	public void introduirPersona() {
		
	}

	public void demanarDadesInicials() {
		
	}

	public void introduirFila() {
		
	}

	public void introduirSeient() {
		
	}


}
