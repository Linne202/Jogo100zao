package jogo_100zao;


/**	edweweqw
 * 
 * @author wiu
 * @since 202302
 */

public class Pergunta {

	String frase;
	String alternativaA;
	String alternativaB;
	String alternativaC;
	String alternativaD;
	String respostaCorreta;
	
	public boolean verificarRespostaCorreta(String alternativa) {
		return alternativa.equals(respostaCorreta);
	}
	
}
