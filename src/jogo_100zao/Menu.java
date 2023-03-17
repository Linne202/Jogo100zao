package jogo_100zao;

import java.util.Scanner;

public class Menu {

	public static void mostrarMenu() {
		
		System.out.println("......... J O G O   D O   1 0 0 Z Ã O .........");
		System.out.println("_______________________________________________\n");
		System.out.println("		| M E N U |	\n");
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
			case 0:
				System.out.println("Obrigado, até mais!!!");
				break;
			case 1:
				Perguntas.iniciar();
				break;
			case 2:
				Credits.mostrar();
				break;
			case 3:
				Tutorial.mostrar();
				break;
			default:
				System.out.println("Valor digitado invalido\n");
			}
			
		} while (resposta != 0);

		sc.close();
	}
}
