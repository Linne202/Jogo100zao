package jogo_100zao;

/***
 * 
 * @author wiu
 * @since 202302
 *
 */
public class Application {

	public static void main(String[] args) {
		
		apresentarJogo();
		Perguntas.iniciar();
	}

	public static void apresentarJogo() {
		System.out.println("========================================================");
		System.out.println("JOGO DO 100ZÃO\nBem vindo ao Jogo!\n");
		System.out.println("========================================================");
		System.out.println("COMO JOGAR!!! \n" + "O jogo tem 10 partidas, contendo perguntas de conhecimentos gerais. \n"
				+ "A cada pergunta haverá uma alternativa correta e três falsas,"
				+ "você \n irá selecionar aquela que você julga estar correta."
				+ "Se você acertar \n a primeira pergunta, o seu prêmio será um valor aleatório \n "
				+ "Durante o jogo você poderá desistir, mas terá que passar pela a taxa de desistência,\n" + ""
				+ "que tem uma porcentagem de desconto de 10% a 35% do seu prêmio!");
		System.out.println();
		System.out.println("========================================================");
		System.out.println();
	}

}
