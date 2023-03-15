package jogo_100zao;

import java.util.Scanner;

public class LeitorDeDados {
	
	private static Scanner scanner;
	
	public LeitorDeDados() {
		scanner = new Scanner(System.in);
	}

	public static int leitorDeNumeroInteiro() {
		return scanner.nextInt();
	}
	
	public static String leitorDeTexto() {
		return scanner.nextLine();
	}
	
	public void fecharLeitor() {
		scanner.close();
	}
	
}
