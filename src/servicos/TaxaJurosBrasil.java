package servicos;

public class TaxaJurosBrasil {
	private Double taxaJuros;
	
	public TaxaJurosBrasil() {
		
	}
	public TaxaJurosBrasil(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public Double getTaxaJurosBrasil() {
		return taxaJuros;
	}
	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public double pagamento(double quantia, int meses) {
		return quantia * (Math.pow(1+taxaJuros, meses));
	}
}
