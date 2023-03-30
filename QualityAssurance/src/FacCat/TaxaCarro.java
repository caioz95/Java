
//10) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
//distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do 
//distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo 
//para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

package FacCat;

import java.util.Scanner;

public class TaxaCarro {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o valor do carro sem taxas: ");
			double valorsemtaxa = sc.nextDouble();

			double aumento = (valorsemtaxa * ((double) 28 / 100)) + (valorsemtaxa * ((double) 45 / 100)) + valorsemtaxa;

			System.out.println("O valor do carro com as taxas: " + String.format("%.2f", aumento));

			sc.close();

		} catch (Exception e) {
			System.out.println("Digite um valor válidos: " + e);
		}

	}

}