package jogo_100zao;

import java.util.Random;

import java.util.Scanner;

public class TaxaDesistencia {
		
	public void calcular () {
		
		int taxa = new Random().nextInt (10, 35);
		double multiplicacao = new Random().nextDouble (0.50, 3.00);
		
		double divisao = taxa * multiplicacao;
		double total = divisao / 100;
		
		System.out.println("Deseja desistir?");
		Scanner sc = new Scanner(System.in);
		String resposta = sc.next();
	
		System.out.println("Sua Taxa de desistência é de " + taxa + "%");
		
		System.out.println("O seu prêmio é R$ " + total);
		
		sc.close();
		
		}
}

