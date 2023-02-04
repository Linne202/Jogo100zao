package jogo_100zao;

import java.util.Random;
import java.util.Scanner;

public class Premio {
	
	public static void main (String[]args) {
		
		double premio = new Random().nextDouble(0.50, 3.00);
		double recompensa = premio * 2;
		
		System.out.println("sua recompensa é: " + recompensa);
		
		System.out.println("Qual foi o país que inventou o chuveiro?\n"
		+ "a\n"
		+ "b\n" 
		+ "c\n"
		+ "d\n");
		Scanner sc = new Scanner (System.in);
		String resposta = sc.nextLine();
		
		if ("c".equals(resposta)) {
			premio = premio * 2;
			System.out.println("seu premio é:" + premio);
		}else {
			System.out.println("Game Over");
		}
		
		System.out.println("Quem é o rei do Pop?\n" 
		+ "a\n"
		+ "b\n" 
		+ "c\n"
		+ "d\n");
		resposta = sc.nextLine();
		
		if ("a".equals(resposta)) {
			premio = premio * 2;
			System.out.println("seu premio é:" + premio);
		}else {
			System.out.println("Game Over");
		}

		}
	}

