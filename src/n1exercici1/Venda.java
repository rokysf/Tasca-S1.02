package n1exercici1;

import java.util.ArrayList;

public class Venda {

	private ArrayList<Producte> productes;
	private int preuTotalVenda = 0;;

	{
		this.productes = new ArrayList<Producte>();
	}

	public void calcularTotal() throws VendaBuidaException {
		if (productes.size() == 0) {
			throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
		} else {
			for (Producte producte : productes) {
				this.preuTotalVenda = this.preuTotalVenda + producte.getPreu();
			}
			System.out.println("El preu total de venda es " + this.preuTotalVenda + "€");
		}
	}

	public void afegirProducte(Producte p) {
		productes.add(p);
	}
}
