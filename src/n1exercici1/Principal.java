package n1exercici1;

public class Principal {

	public static void main(String[] args) {

		Venda v1 = new Venda();

		Producte p1 = new Producte("Coche", 25000);
		Producte p2 = new Producte("Moto", 5000);
		Producte p3 = new Producte("Portatil", 600);
		Producte p4 = new Producte("Nevera", 450);

		v1.afegirProducte(p1);
		v1.afegirProducte(p2);
		v1.afegirProducte(p3);
		v1.afegirProducte(p4);

		try {
			v1.calcularTotal();
		} catch (VendaBuidaException e) {
			System.out.println(e.getMessage());
		}
	}
}
