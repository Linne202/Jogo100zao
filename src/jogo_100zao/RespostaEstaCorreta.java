package jogo_100zao;

/***
 * 
 * @author Linne202
 * @since 20230311
 *
 */ 

import java.util.Scanner;

public class RespostaEstaCorreta {

	public static boolean mostrarSeRespostaEstaCorreta(Pergunta perg) {
		
		Scanner sc = new Scanner(System.in);
		String respostaEscolhida = sc.nextLine();

		if (respostaEscolhida.equals(perg.respostaCorreta)) {
			System.out.println("_____________ V O C Ê   A C E R T O U _____________\n");
			return true;
		} else {
			System.out.println("\n____________ Y O U   L O S E R ____________\n");
			return false;
		}

	}
	
}
