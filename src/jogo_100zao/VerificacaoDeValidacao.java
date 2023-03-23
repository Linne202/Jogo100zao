package jogo_100zao;

import java.util.Enumeration;
import java.util.Scanner;

/***
 * 
 * @author Linne202
 * @since 202303
 *
 */

public class VerificacaoDeValidacao {

	public static boolean textoDesejaDesistir(double premioAcumulado) {

		Scanner sc = new Scanner(System.in);
		boolean digitouErrado = true;
		int resposta = 0;
		do {
			try { 
				System.out.println("Você deseja desistir?");
				System.out.println("Digite 1 para SIM e 2 para NÃO");
				resposta = Integer.parseInt(sc.nextLine());
				digitouErrado = false;
			} catch (Exception e) {
				
				System.out.println("\nVocê digitou um valor inválido.\nDigite um número corresponde com a sua vontade.\n");
				digitouErrado = true;
			}
		} while (digitouErrado == true);

		if (resposta == 1) {
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
