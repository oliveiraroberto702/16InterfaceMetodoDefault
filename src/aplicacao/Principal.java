package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import servicos.TaxaJuros;
import servicos.TaxaJurosBrasil;

public class Principal {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double quantia_sc = sc.nextDouble();
		
		System.out.print("Meses: ");
		int meses_sc = sc.nextInt();
		
		//TaxaJurosBrasil tj = new TaxaJurosBrasil(2.0);
		//TaxaJurosUSA tj = new TaxaJurosUSA(1.0);
		TaxaJuros tj = new TaxaJurosBrasil(2.0);
		double pagamento = tj.pagamento(quantia_sc, meses_sc);
		System.out.println("Pagamento após " + meses_sc + " meses:");
		System.out.printf("%.2f%n", pagamento);
		
		sc.close();
		
	}

}
