package jogo_100zao;

import java.util.Scanner;

public class VerificacaoDeValidacao {

	public static boolean desejaDesistir(double premioAcumulado) {

		System.out.println("Você deseja desistir?");
		System.out.println("Digite 1 para SIM e 2 para NÃO");

		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();

		if (resposta == 1) {
			double valorFinal = TaxaDesistencia.calcularPremioFinal(premioAcumulado);
			System.out.println("Até uma próxima jogatina!/n :)");
			System.out.println("Vc ganhou: " + valorFinal);
			return true;
		}
		return false;
	}

}
