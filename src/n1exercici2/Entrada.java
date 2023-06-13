package n1exercici2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	private static Scanner sc = new Scanner(System.in);

	public static byte llegirByte(String missatge) {
		byte i = 0;
		do {
			System.out.println(missatge);
			try {
				i = sc.nextByte();
			} catch (InputMismatchException e) {
				System.out.println("Has introduit un número no valid");
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
				System.out.println("Has introduit un número no valid");
				sc.next();
			}
		} while (i == 0);
		return i;
	}

	public static float llegirFloat(String missatge) {

		return 0;
	}

	public static double llegirDouble(String missatge) {

		return 0;
	}
}
