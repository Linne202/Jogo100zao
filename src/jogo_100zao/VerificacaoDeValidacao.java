package jogo_100zao;

import java.util.InputMismatchException;
import java.util.Scanner;

/***
 * 
 * @author Linne202
 * @since 202303
 *
 */

public class VerificacaoDeValidacao {

	public static void mostraTextoDeDesistencia() {
		
	boolean continuarTry = false;
	
	do
	{

		System.out.println("Você deseja desistir?");
		System.out.println("Digite 1 para SIM e 2 para NÃO");
		Scanner sc = new Scanner(System.in);

		try {

		} catch (InputMismatchException erroDeInput) {
			System.out.println("Por favor, digite um númedo dentro das opções!");
			int resposta = sc.nextInt();
			resposta = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Erro: " + e);
			System.out.println("Por favor, digite um númedo dentro das opções!");
			int resposta = sc.nextInt();
			resposta = sc.nextInt();
		}
		sc.close(); 

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


