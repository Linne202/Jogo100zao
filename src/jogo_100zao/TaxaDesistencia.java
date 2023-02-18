package jogo_100zao;

/**	
 * 
 * @author Linne202
 * @since 20230216
 */

import java.util.Random;
import java.util.Scanner;

public class TaxaDesistencia {

	public static void main(String[] args) {

		calcularTaxaDesistencia();

	}

	public static void calcularTaxaDesistencia() {

		int taxa = new Random().nextInt(10, 35);
		double multiplicacao = new Random().nextDouble(0.50, 3.00);

		double divisao = taxa * multiplicacao;
		double total = divisao / 100;

		System.out.println("Deseja desistir?");
		Scanner sc = new Scanner(System.in);
		String resposta = sc.next();

		System.out.println("Sua Taxa de desistência é de " + taxa + "%");

		System.out.println("O seu prêmio é R$ " + total);

		sc.close();
	}
}
