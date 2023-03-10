package jogo_100zao;

import java.util.Scanner;

public class VerificacaoDeValidacao {

	public static boolean textoDeDesistencencia() {

		System.out.println("Você deseja desistir?");
		System.out.println("Digite 1 para sim e 2 para não.");

		Scanner sc = new Scanner(System.in);
		int resposta = sc.nextInt();

		if (resposta == 1) {
			System.out.println("Até uma próxima jogatina!/n :)");
			return true;
		}
		return false;
	}

}
