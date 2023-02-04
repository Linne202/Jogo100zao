package jogo_100zao;

import java.util.Scanner;

public class Perguntas {

	public static void iniciar() {

		Pergunta pergunta1 = new Pergunta();
		pergunta1.frase = "Qual foi o país que inventou o chuveiro elétrico?";
		pergunta1.alternativaA = "a) França";
		pergunta1.alternativaB = "b) Inglaterra";
		pergunta1.alternativaC = "c) Brasil";
		pergunta1.alternativaD = "d) Austrália";
		pergunta1.respostaCorreta = "c";

		Pergunta pergunta2 = new Pergunta();
		pergunta2.frase = "Quem é o rei do Pop?";
		pergunta2.alternativaA = "a) Elvis Presley ";
		pergunta2.alternativaB = "b) Bruno Mars";
		pergunta2.alternativaC = "c) Manoel Gomes";
		pergunta2.alternativaD = "d) Micheal Jackson";
		pergunta2.respostaCorreta = "d";
		
	
		System.out.println(pergunta1.frase);
		System.out.println(pergunta1.alternativaA);
		System.out.println(pergunta1.alternativaB);
		System.out.println(pergunta1.alternativaC);
		System.out.println(pergunta1.alternativaD);
		Scanner sc = new Scanner(System.in);
		
		String respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta1.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("Errou");
		}
		
		System.out.println(pergunta2.frase);
		System.out.println(pergunta2.alternativaA);
		System.out.println(pergunta2.alternativaB);
		System.out.println(pergunta2.alternativaC);
		System.out.println(pergunta2.alternativaD);
		
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta2.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("Errou");
		}
		
		sc.close();
	
	}
}
