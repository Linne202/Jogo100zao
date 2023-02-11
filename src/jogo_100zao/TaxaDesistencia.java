package jogo_100zao;

import java.util.Random;
import java.util.Scanner;

public class TaxaDesistencia {
	
	public static void main (String [] args) {
		
		int taxa = new Random().nextInt (10, 35);
		double premio = new Random().nextDouble (0.50, 3.00);
		
		double recompensa = taxa * premio;
		double total = recompensa / 100;
		
		System.out.println("Deseja desistir?");
		Scanner sc = new Scanner(System.in);
		String aa = sc.next();
	
		System.out.println("Sua Taxa de desistência é de " + taxa + "%");
		
		
		System.out.println("Seu prêmio atual é: R$" + premio);
		System.out.println("O seu prêmio é R$ " + total);
		
		sc.close();
	}

}
