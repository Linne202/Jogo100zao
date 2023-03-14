package jogo_100zao;

import java.util.Scanner;

public class RespostaEstaCorreta {

	public static boolean mostrarSeRespostaEstaCorreta(Pergunta perg) {
		
		Scanner sc = new Scanner(System.in);
		String respostaEscolhida = sc.nextLine();

		if (respostaEscolhida.equals(perg.respostaCorreta)) {
			System.out.println("Parabéns, você acertou :)\n");
			return true;
		} else {
			System.out.println("\n		Y O U   L O S E R\n");
			return false;
		}

	}
	
}
