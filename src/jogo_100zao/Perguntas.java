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
		String respostaEscolhida = sc.nextLine();
		
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
		
		respostaEscolhida = sc.nextLine();
		
		if(respostaEscolhida.equals(pergunta2.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		Pergunta pergunta3 = new Pergunta();
		pergunta3.frase = ".................... P E R G U N T A  03 ....................\n\nQuantos ossos tem um corpo humano ?\n";
		pergunta3.alternativaA = "a) 209";
		pergunta3.alternativaB = "b) 203";
		pergunta3.alternativaC = "c) 201";
		pergunta3.alternativaD = "d) 206";
		pergunta3.respostaCorreta = "d";
		
		System.out.println(pergunta3.frase);
		System.out.println(pergunta3.alternativaA);
		System.out.println(pergunta3.alternativaB);
		System.out.println(pergunta3.alternativaC);
		System.out.println(pergunta3.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta3.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		
		Pergunta pergunta4 = new Pergunta();
		pergunta4.frase = ".................... P E R G U N T A  04 ....................\n\nQual é a sigla do HD ?\n";
		pergunta4.alternativaA = "a) Hard Definition";
		pergunta4.alternativaB = "b) Hardcore";
		pergunta4.alternativaC = "c) High Dress";
		pergunta4.alternativaD = "d) Hard";
		pergunta4.respostaCorreta = "a";
		
		System.out.println(pergunta4.frase);
		System.out.println(pergunta4.alternativaA);
		System.out.println(pergunta4.alternativaB);
		System.out.println(pergunta4.alternativaC);
		System.out.println(pergunta4.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta4.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		Pergunta pergunta5 = new Pergunta();
		pergunta5.frase = ".................... P E R G U N T A  05 ....................\n\nComplete a música \nOs seus problemas você deve esquecer...\n";
		pergunta5.alternativaA = "a) Hakuna matata! Sim, vai entender!";
		pergunta5.alternativaB = "b) Isso é viver, é aprender!";
		pergunta5.alternativaC = "c) Hakuna matata";
		pergunta5.alternativaD = "d) Essas duas palavras resolvem todos os seus problemas!";
		pergunta5.respostaCorreta = "b";
		
		System.out.println(pergunta5.frase);
		System.out.println(pergunta5.alternativaA);
		System.out.println(pergunta5.alternativaB);
		System.out.println(pergunta5.alternativaC);
		System.out.println(pergunta5.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta5.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		Pergunta pergunta6 = new Pergunta();
		pergunta6.frase = ".................... P E R G U N T A  06 ....................\n\nQuais são os nomes dos cinco oceanos ?\n";
		pergunta6.alternativaA = "a) Atlântica, Índico, agressivo e Glacial Antártico";
		pergunta6.alternativaB = "b) Atlântico, Índicio, Pacífico, Glacial Ártico e Guaraná Antarctica ";
		pergunta6.alternativaC = "c) Atlântico, Índico, Pacífico, Glacial Ártico e Glacial Antártico";
		pergunta6.alternativaD = "d) Atlântico, Índico, Pacífico, Gladiadores Ártico e Gladiadores Antártico";
		pergunta6.respostaCorreta = "c";
		
		System.out.println(pergunta6.frase);
		System.out.println(pergunta6.alternativaA);
		System.out.println(pergunta6.alternativaB);
		System.out.println(pergunta6.alternativaC);
		System.out.println(pergunta6.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta6.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		
		Pergunta pergunta7 = new Pergunta();
		pergunta7.frase = ".................... P E R G U N T A  07 ....................\n\nQuantas vezes o Brasil foi campeão da Copa do Mundo ?\n";
		pergunta7.alternativaA = "a) 4";
		pergunta7.alternativaB = "b) 6";
		pergunta7.alternativaC = "c) 3";
		pergunta7.alternativaD = "d) 5";
		pergunta7.respostaCorreta = "d";
		
		System.out.println(pergunta7.frase);
		System.out.println(pergunta7.alternativaA);
		System.out.println(pergunta7.alternativaB);
		System.out.println(pergunta7.alternativaC);
		System.out.println(pergunta7.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta7.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		Pergunta pergunta8 = new Pergunta();
		pergunta8.frase = ".................... P E R G U N T A  08 ....................\n\nQual é o maior animal vivo do planeta Terra ?\n";
		pergunta8.alternativaA = "a) Elefante";
		pergunta8.alternativaB = "b) Baleia azul";
		pergunta8.alternativaC = "c) Tubarão";
		pergunta8.alternativaD = "d) Rinoceronte";
		pergunta8.respostaCorreta = "b";
		
		System.out.println(pergunta8.frase);
		System.out.println(pergunta8.alternativaA);
		System.out.println(pergunta8.alternativaB);
		System.out.println(pergunta8.alternativaC);
		System.out.println(pergunta8.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta8.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		Pergunta pergunta9 = new Pergunta();
		pergunta9.frase = ".................... P E R G U N T A  09 ....................\n\nQuantos anos há em dois séculos e meio ?\n";
		pergunta9.alternativaA = "a) 25 anos";
		pergunta9.alternativaB = "b) 250 anos";
		pergunta9.alternativaC = "c) 2500 anos";
		pergunta9.alternativaD = "d) 25000 anos";
		pergunta9.respostaCorreta = "b";
		
		System.out.println(pergunta9.frase);
		System.out.println(pergunta9.alternativaA);
		System.out.println(pergunta9.alternativaB);
		System.out.println(pergunta9.alternativaC);
		System.out.println(pergunta9.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta9.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		Pergunta pergunta10 = new Pergunta();
		pergunta10.frase = ".................... P E R G U N T A  10 ....................\n\nA laranja é uma cor ou fruta ?\n";
		pergunta10.alternativaA = "a) É um Suco";
		pergunta10.alternativaB = "b) É uma Fruta";
		pergunta10.alternativaC = "c) É uma Cor";
		pergunta10.alternativaD = "d) É uma fruta e cor";
		pergunta10.respostaCorreta = "d";
		
		System.out.println(pergunta10.frase);
		System.out.println(pergunta10.alternativaA);
		System.out.println(pergunta10.alternativaB);
		System.out.println(pergunta10.alternativaC);
		System.out.println(pergunta10.alternativaD);
		
		respostaEscolhida = sc.next();
		
		if(respostaEscolhida.equals(pergunta10.respostaCorreta)) {
			System.out.println("Acertou");
		} else {
			System.out.println("----------------- Game Over -----------------");
		}
		
		sc.close();
	
	}
}