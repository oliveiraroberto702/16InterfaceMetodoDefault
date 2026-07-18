package servicos;

public class TaxaJurosUSA implements TaxaJuros {

	private double taxaJuros;

	public TaxaJurosUSA (double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}
	
}
