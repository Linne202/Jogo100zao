package jogo_100zao;

import java.util.Scanner;

public class Menu {

	public static void mostrarMenu() {
		
		System.out.println(".......... J O G O   D O   1 0 0 Z Ã O ..........");
		System.out.println("_________________________________________________\n");
		System.out.println("		| M E N U |				\n");
		System.out.println("Digite o número da opção que você deseja.\n");
		System.out.println("1 - Começar o jogo.");
		System.out.println("2 - Créditos.");
		System.out.println("3 - Tutorial");
		System.out.println("0 - Sair do jogo.\n");

	}

	public static void iniciar() {

		Scanner sc = new Scanner(System.in);
		int resposta;

		do {

			mostrarMenu();
			resposta = sc.nextInt();

			switch (resposta) {
			case 1:
				Perguntas.iniciar();
				break;
			case 2:
				Creditos.iniciar();
				break;
			case 3:
				Tutorial.iniciar();
				break;
			default:
				System.out.println("Valor digitado invalido");
			}
			
		} while (resposta != 0);

		sc.close();
	}
}
