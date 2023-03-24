package jogo_100zao;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Calculo {

	public static boolean calculoPrimeiraPergunta (double premioAcumulado) {
		
		int resposta = 0;
		double premio = ThreadLocalRandom.current().nextDouble(0.5, 3);
		boolean desejaDesistir;
		boolean digitouErrado = true;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			try {
				
				System.out.println("- Você ganhou : R$" + String.format("%1$,.2f\n", premio));
				double premioFinalParticipante = TaxaDesistencia.calcularPremioFinal(premio);
				premio = Premio.calcularPremioFinal(premio);
				desejaDesistir = VerificacaoDeValidacao.textoDesejaDesistir(premioFinalParticipante);
				resposta = Integer.parseInt(sc.nextLine());
				digitouErrado = false;
				
			} catch (Exception e) {
				System.out.println("\nVocê digitou um valor inválido.\nDigite um número corresponde com a sua vontade.\n");
				digitouErrado = true;
			}
		} while (digitouErrado == true);

		if (digitouErrado == false) {
			double valorFinal = TaxaDesistencia.calcularPremioFinal(premioAcumulado);
			System.out.println("Seu saldo: R$" + String.format("%1$,.2f\n", valorFinal));
			System.out.println("... I S S O   É   T U D O   P E S S O A L ...\n");
			sc.close();
			return true;
		}
		sc.close();
		return false;

	}

}
