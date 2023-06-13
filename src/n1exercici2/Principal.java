package n1exercici2;

public class Principal {

	public static void main(String[] args) {

		/*
		 * byte a=Entrada.llegirByte("Hola, introdueix un n�mero entre -128 y 127");
		 * System.out.println("Has introduit el n�mero "+a+", es correcte");
		 * 
		 * int b=Entrada.llegirInt("Hola, introdueix un n�mero entre -128 y 127");
		 * System.out.println("Has introduit el n�mero "+b+", es correcte");
		 * 
		 * float c=Entrada.llegirFloat("Hola, introdueix un n�mero entre -128 y 127");
		 * System.out.println("Has introduit el n�mero "+c+", es correcte");
		 * 
		 * double d=Entrada.llegirFloat("Hola, introdueix un n�mero entre -128 y 127");
		 * System.out.println("Has introduit el n�mero "+d+", es correcte");
		 * 
		 * char e=Entrada.llegirChar("Hola, introdueix un caracter");
		 * System.out.println("Has introduit el caracter "+e+", es correcte");
		 * 
		 * String e=Entrada.llegirChar("Hola, introdueix un caracter");
		 * System.out.println("Has introduit el caracter "+e+", es correcte");
		 */
		try {
			boolean e = Entrada.llegirSiNo("Hola, ets major d'edad? (S/N)");
			if (e == true) {
				System.out.println("Has introduit S, es correcte");
			} else {
				System.out.println("Has introduit N, es correcte");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
