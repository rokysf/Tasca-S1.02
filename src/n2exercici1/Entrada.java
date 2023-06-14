package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	static Scanner sc = new Scanner(System.in);

	public static byte llegirByte(String missatge) {
		byte i = 0;
		do {
			System.out.println(missatge);
			try {
				i = sc.nextByte();
			} catch (InputMismatchException e) {
				System.out.println("Has introduit un numero no valid");
				sc.next();
			}
		} while (i == 0);
		return i;
	}

	public static int llegirInt(String missatge) {
		int i = 0;
		do {
			System.out.println(missatge);
			try {
				i = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Has introduit un numero no valid");
				sc.next();
			}
		} while (i == 0);
		return i;
	}

	public static float llegirFloat(String missatge) {
		float i = 0;
		do {
			System.out.println(missatge);
			try {
				i = sc.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.next();
			}
		} while (i == 0);
		return i;
	}

	public static double llegirDouble(String missatge) {
		double i = 0;
		do {
			System.out.println(missatge);
			try {
				i = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error de format");
				sc.next();
			}
		} while (i == 0);
		return i;
	}

	public static char llegirChar(String missatge) throws Exception{
		char c = '\0';
		System.out.println(missatge);
		String entrada = sc.nextLine();
		if(entrada.length()>1) {
			throw new Exception("Error, has introduit mes d'un caracter");
		}else {
			c = entrada.charAt(0);
		}
		return c;
	}

	public static String llegirString(String missatge) throws Exception{
		
		System.out.println(missatge);
		String entrada = sc.nextLine();
		if(entrada.length()==1) {
			throw new Exception("Error, has introduit nomes un caracter");
		}
		return entrada;
	}

	public static boolean llegirSiNo(String missatge) throws Exception {
		boolean resultado;
		System.out.print(missatge);
		String entrada = sc.nextLine();
		if (entrada.equalsIgnoreCase("S")) {
			resultado = true;
		} else if (entrada.equalsIgnoreCase("N")) {
			resultado = false;
		} else {
			throw new Exception("El valor introduit no es valid.");
		}
		return resultado;
	}

}
