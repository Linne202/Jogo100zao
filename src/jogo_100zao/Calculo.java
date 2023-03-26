package jogo_100zao;

import java.util.concurrent.ThreadLocalRandom;

public class Calculo {

	public static boolean calculoPrimeiraPergunta(double premioAcumulado) {

		double premio = ThreadLocalRandom.current().nextDouble(0.5, 3);

		System.out.println("- Você ganhou : R$" + String.format("%1$,.2f\n", premio));
		double premioFinalParticipante = TaxaDesistencia.calcularPremioFinal(premio);
		premio = Premio.calcularPremioFinal(premio);
		boolean desejaDesistir = VerificacaoDeValidacao.textoDesejaDesistir(premioFinalParticipante);

		if (desejaDesistir == true) {
			return desejaDesistir;
		} else {
			if (desejaDesistir == false) {
				System.out.println("\\nVocê digitou um valor inválido.\\nDigite um número corresponde com a sua vontade.\\n");
				return desejaDesistir;
			}
			System.out.println("Seu prêmio com desconto: R$" + String.format("%1$,.2f\n", premioFinalParticipante));
		}

		return false;

	}

	public static boolean calcularPergunta(double premioAcumulado) {

		double premio = ThreadLocalRandom.current().nextDouble(0.5, 3);

		System.out.println("- Seu prêmio atual é: R$" + String.format("%1$,.2f\n", premio));
		double premioFinalParticipante = TaxaDesistencia.calcularPremioFinal(premio);
		System.out.println("Seu prêmio com desconto: R$" + String.format("%1$,.2f\n", premioFinalParticipante));
		VerificacaoDeValidacao.textoDesejaDesistir(premioFinalParticipante);
		boolean desejaDesistir = VerificacaoDeValidacao.textoDesejaDesistir(premioFinalParticipante);
		premio = Premio.calcularPremioFinal(premio);

		if (desejaDesistir == true) {
			return desejaDesistir;
		} else {
			System.out.println("Seu prêmio com desconto: R$" + String.format("%1$,.2f\n", premioFinalParticipante));
		}

		return false;

	}

		public static boolean calcularUltimaPergunta (double premioAcumulado) {
		
		double premio = ThreadLocalRandom.current().nextDouble(0.5, 3);
		
		System.out.println("- Seu prêmio atual é: R$" + String.format("%1$,.2f\n", premio));
		double premioFinalParticipante = TaxaDesistencia.calcularPremioFinal(premio);
		System.out.println("Seu prêmio com desconto: R$" + String.format("%1$,.2f\n", premioFinalParticipante));
		VerificacaoDeValidacao.textoDesejaDesistir(premioFinalParticipante);
		boolean desejaDesistir = VerificacaoDeValidacao.textoDesejaDesistir(premioFinalParticipante);
		premio = Premio.calcularPremioFinal(premio);
		
		if (desejaDesistir == true) {
			return desejaDesistir;
		} else {
			System.out.println("Seu prêmio com desconto: R$" + String.format("%1$,.2f\n", premioFinalParticipante));
			Credits.mostrar();
		}
		
		return false;
		
		}

}
