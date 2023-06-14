package n2exercici1;

public class Principal {

	public static void main(String[] args) {

	metodeByte();
	metodeInt();
	metodeFloat();
	metodeDouble();
	metodeChar();
	metodeString();
	metodeSiNo();
	
	}

	public static void metodeByte() {
		byte a = Entrada.llegirByte("Hola, introdueix un numero entre -128 y 127");
		System.out.println("Has introduit el numero " + a + ", es correcte");
	}

	public static void metodeInt() {
		int b = Entrada.llegirInt("Hola, introdueix un numero enter");
		System.out.println("Has introduit el numero " + b + ", es correcte");
	}

	public static void metodeFloat() {
		float c = Entrada.llegirFloat("Hola, introdueix un numero amb decimals");
		System.out.println("Has introduit el numero " + c + ", es correcte");
	}

	public static void metodeDouble() {
		double d = Entrada.llegirDouble("Hola, introdueix un numero amb decimals");
		System.out.println("Has introduit el numero " + d + ", es correcte");
	}

	public static void metodeChar() {
		char f = '\0';
		do {
			try {
				f = Entrada.llegirChar("Hola, introdueix un caracter");
				System.out.println("Has introduit el caracter " + f + ", es correcte");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (f == '\0');
	}

	public static void metodeString() {
		String s = "";
		do {
			try {
				s = Entrada.llegirString("Hola, introdueix un cadena de caracters");
				System.out.println("Has introduit la cadena " + s + ", es correcte");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (s == "");
	}

	public static void metodeSiNo() {
		int i = 0;
		do {
			try {
				boolean e = Entrada.llegirSiNo("Hola, ets major d'edad? (S/N)");
				if (e == true) {
					System.out.println("Has introduit S, es correcte");
				} else {
					System.out.println("Has introduit N, es correcte");
				}
				i++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (i == 0);
	}

}
