package jogo_100zao;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {

	}

	public static boolean calculoPrimeiraPergunta() {

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
				System.out.println(
						"\nVocê digitou um valor inválido.\nDigite um número corresponde com a sua vontade.\n");
				digitouErrado = true;
			}
		} while (digitouErrado == true);

		return false;

	}

}
