package n1exercici2;

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
				System.out.println("Has introduit un n�mero no valid");
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
				System.out.println("Has introduit un n�mero no valid");
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

	public static char llegirChar(String missatge) {
		char c = '\0';
		do {
			System.out.println(missatge);
			try {
				c = sc.nextLine().charAt(0);
			} catch (Exception e) {
				System.out.println("Has introduit un caracter no valid");
			}
		} while (c == '\0');
		return c;
	}

	/*
	 * public static char llegirString(String missatge) { char b = 'b'; int i = 0;
	 * do { System.out.println(missatge); try { String str = sc.nextLine(); } catch
	 * (Exception e) { System.out.println("Has introduit un n�mero no valid");
	 * sc.next(); } } while (i == 0); return b; }
	 */

	// public static boolean llegirSiNo(String missatge) {

	// return true;
	// }

	public static boolean llegirSiNo(String missatge) throws Exception {
		boolean resultado;
		System.out.print(missatge);
		String input = sc.nextLine();
		if (input.equalsIgnoreCase("S")) {
			resultado = true;
		} else if (input.equalsIgnoreCase("N")) {
			resultado = false;
		} else {
			throw new Exception("El valor introduït no és vàlid.");
		}
		return resultado;
	}

}
