package jogo_100zao;

import java.util.Scanner;

public class Perguntas {	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("PERGUNTA 01");
		System.out.println("Qual foi o país que inventou o chuveiro elétrico?");
		System.out.println("a) França");
		System.out.println("b) Inglaterra");
		System.out.println("c) Brasil");
		System.out.println("d) Austrália");
		
		String resposta = sc.nextLine();

		if (resposta.equals("c")) {
			System.out.println("Parabéns, você acertou!\n");
		} else {
			System.out.println("Game Over :( \n" + "Deseja tentar novamente? \n"
					+ "Digite 1 para jogar novamente ou 2 para sair do jogo \n");
			resposta = sc.nextLine();
			"1".equals(resposta);
		}
		if ("1".equals(resposta)) {

		}

		System.out.println("PERGUNTA 02 \n" + "Quem é o rei do Pop? \n" + "a) Elvis Presley \n" + "b) Bruno Mars \n"
				+ "c) Manoel Gomes \n" + "d) Micheal Jackson \n");
		resposta = sc.nextLine();

		if ("d".equals(resposta)) {
			System.out.println("Parabéns, você acertou!\n");
		} else {
			System.out.println("Game Over :( \n" + "Deseja tentar novamente?");
		}

		System.out.println("PERGUNTA 03 \n" + "Qual é a principal matéria prima do petróleo? \n");

		System.out.println("PERGUNTA 04 \n" + "Em qual ano foi fundada a Coca Cola? \n");

		sc.close();
	}
}
