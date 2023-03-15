package jogo_100zao;

import java.util.InputMismatchException;

/***
 * 
 * @author Linne202
 * @since 202303
 *
 */

import java.util.Scanner;

public class VerificacaoDeValidacao {

	boolean continuarTry;

	public static boolean desejaDesistir(double premioAcumulado) {
		
	do
	{

		System.out.println("Você deseja desistir?");
		System.out.println("Digite 1 para SIM e 2 para NÃO");

		try {

		} catch (InputMismatchException erroDeInput) {
			System.out.println("Por favor, digite um númedo dentro das opções!");
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}

	}while(continuarTry);
	}

	public static boolean desejaDesistir(double premioAcumulado) {
		
		System.out.println("Você deseja desistir?");
		System.out.println("Digite 1 para SIM e 2 para NÃO");

		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();

		if (resposta == 1) {
			double valorFinal = TaxaDesistencia.calcularPremioFinal(premioAcumulado);
			System.out.println("Seu saldo: R$" + String.format("%1$,.2f\n", valorFinal));
			System.out.println("... I S S O   É   T U D O   P E S S O A L ...\n");
			return true;
		}
		return false;
	}
}

}
