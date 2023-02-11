package jogo_100zao;

/**
 * 
 * @author linne202
 * @since 20230210
 */

import java.util.Scanner;

public class Perguntas {

	public static void iniciar() {

		Pergunta pergunta1 = new Pergunta();
		pergunta1.frase = ".................... P E R G U N T A  01 ....................\n\nQual foi o país que inventou o chuveiro elétrico ?\n";
		pergunta1.alternativaA = "a) França";
		pergunta1.alternativaB = "b) Inglaterra";
		pergunta1.alternativaC = "c) Brasil";
		pergunta1.alternativaD = "d) Austrália";
		pergunta1.respostaCorreta = "c";
		
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
			System.out.println("\n----------------- Game Over -----------------\n");
		}
		
		Pergunta pergunta2 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  02 ....................\n\nQuem é o rei do Pop ?\n";
		pergunta2.alternativaA = "a) Elvis Presley ";
		pergunta2.alternativaB = "b) Bruno Mars";
		pergunta2.alternativaC = "c) Manoel Gomes";
		pergunta2.alternativaD = "d) Micheal Jackson";
		pergunta2.respostaCorreta = "d";
		
		System.out.println(pergunta2.frase);
		System.out.println(pergunta2.alternativaA);
		System.out.println(pergunta2.alternativaB);
		System.out.println(pergunta2.alternativaC);
		System.out.println(pergunta2.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta2.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		Pergunta pergunta3 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  03 ....................\n\nQuantos ossos tem um corpo humano ?\n";
		pergunta2.alternativaA = "a) 209";
		pergunta2.alternativaB = "b) 203";
		pergunta2.alternativaC = "c) 201";
		pergunta2.alternativaD = "d) 206";
		pergunta2.respostaCorreta = "d";
		
		System.out.println(pergunta3.frase);
		System.out.println(pergunta3.alternativaA);
		System.out.println(pergunta3.alternativaB);
		System.out.println(pergunta3.alternativaC);
		System.out.println(pergunta3.alternativaD);
		
		Pergunta pergunta4 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  04 ....................\n\nQual é a sigla do HD ?\n";
		pergunta2.alternativaA = "a) Hard Definition";
		pergunta2.alternativaB = "b) Hardcore";
		pergunta2.alternativaC = "c) High Dress";
		pergunta2.alternativaD = "d) Hard";
		pergunta2.respostaCorreta = "a";
		
		System.out.println(pergunta4.frase);
		System.out.println(pergunta4.alternativaA);
		System.out.println(pergunta4.alternativaB);
		System.out.println(pergunta4.alternativaC);
		System.out.println(pergunta4.alternativaD);
		
		Pergunta pergunta5 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  05 ....................\n\nComplete a música \nOs seus problemas você deve esquecer...\n";
		pergunta2.alternativaA = "a) Hakuna matata! Sim, vai entender!";
		pergunta2.alternativaB = "b) Isso é viver, é aprender!";
		pergunta2.alternativaC = "c) Hakuna matata";
		pergunta2.alternativaD = "d) Essas duas palavras resolvem todos os seus problemas!";
		pergunta2.respostaCorreta = "b";
		
		System.out.println(pergunta5.frase);
		System.out.println(pergunta5.alternativaA);
		System.out.println(pergunta5.alternativaB);
		System.out.println(pergunta5.alternativaC);
		System.out.println(pergunta5.alternativaD);
		
		Pergunta pergunta6 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  06 ....................\n\nQuais são os nomes dos cinco oceanos ?\n";
		pergunta2.alternativaA = "a) Atlântica, Índico, agressivo e Glacial Antártico";
		pergunta2.alternativaB = "b) Atlântico, Índicio, Pacífico, Glacial Ártico e Guaraná Antarctica ";
		pergunta2.alternativaC = "c) Atlântico, Índico, Pacífico, Glacial Ártico e Glacial Antártico";
		pergunta2.alternativaD = "d) Atlântico, Índico, Pacífico, Gladiadores Ártico e Gladiadores Antártico";
		pergunta2.respostaCorreta = "c";
		
		System.out.println(pergunta6.frase);
		System.out.println(pergunta6.alternativaA);
		System.out.println(pergunta6.alternativaB);
		System.out.println(pergunta6.alternativaC);
		System.out.println(pergunta6.alternativaD);
		
		Pergunta pergunta7 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  07 ....................\n\nQuantas vezes o Brasil foi campeão da Copa do Mundo ?\n";
		pergunta2.alternativaA = "a) 4";
		pergunta2.alternativaB = "b) 6";
		pergunta2.alternativaC = "c) 3";
		pergunta2.alternativaD = "d) 5";
		pergunta2.respostaCorreta = "d";
		
		System.out.println(pergunta7.frase);
		System.out.println(pergunta7.alternativaA);
		System.out.println(pergunta7.alternativaB);
		System.out.println(pergunta7.alternativaC);
		System.out.println(pergunta7.alternativaD);
		
		Pergunta pergunta8 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  08 ....................\n\nQual é o maior animal vivo do planeta Terra ?\n";
		pergunta2.alternativaA = "a) Elefante";
		pergunta2.alternativaB = "b) Baleia azul";
		pergunta2.alternativaC = "c) Tubarão";
		pergunta2.alternativaD = "d) Rinoceronte";
		pergunta2.respostaCorreta = "b";
		
		System.out.println(pergunta8.frase);
		System.out.println(pergunta8.alternativaA);
		System.out.println(pergunta8.alternativaB);
		System.out.println(pergunta8.alternativaC);
		System.out.println(pergunta8.alternativaD);
		
		Pergunta pergunta9 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  09 ....................\n\nQuantos anos há em dois séculos e meio ?\n";
		pergunta2.alternativaA = "a) 25 anos";
		pergunta2.alternativaB = "b) 250 anos";
		pergunta2.alternativaC = "c) 2500 anos";
		pergunta2.alternativaD = "d) 25000 anos";
		pergunta2.respostaCorreta = "b";
		
		System.out.println(pergunta9.frase);
		System.out.println(pergunta9.alternativaA);
		System.out.println(pergunta9.alternativaB);
		System.out.println(pergunta9.alternativaC);
		System.out.println(pergunta9.alternativaD);
		
		Pergunta pergunta10 = new Pergunta();
		pergunta2.frase = ".................... P E R G U N T A  10 ....................\n\nA laranja é uma cor ou fruta ?\n";
		pergunta2.alternativaA = "a) É um Suco";
		pergunta2.alternativaB = "b) É uma Fruta";
		pergunta2.alternativaC = "c) É uma Cor";
		pergunta2.alternativaD = "d) É uma fruta e cor";
		pergunta2.respostaCorreta = "d";
		
		System.out.println(pergunta10.frase);
		System.out.println(pergunta10.alternativaA);
		System.out.println(pergunta10.alternativaB);
		System.out.println(pergunta10.alternativaC);
		System.out.println(pergunta10.alternativaD);
		
		sc.close();
	
	}
}