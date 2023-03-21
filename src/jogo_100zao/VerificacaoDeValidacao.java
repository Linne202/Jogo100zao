package jogo_100zao;

import java.util.Scanner;

/***
 * 
 * @author Linne202
 * @since 202303
 *
 */

public class VerificacaoDeValidacao {
<<<<<<< HEAD

	@SuppressWarnings("resource")

	public static boolean TextoDesejaDesistir(double premioAcumulado) {

		System.out.println("Você deseja desistir?");
		System.out.println("Digite 1 para SIM e 2 para NÃO");

		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();

		if (resposta == 1) {
			double valorFinal = TaxaDesistencia.calcularPremioFinal(premioAcumulado);
			System.out.println("Seu saldo: R$" + String.format("%1$,.2f\n", valorFinal));
			System.out.println("... I S S O   É   T U D O   P E S S O A L ...\n");

			sc.close();

			return true;

		}
		
		return false;

	}
=======
>>>>>>> 0ca4756f6136b2d0b23c7efc0ce9446307dcfd17

}
