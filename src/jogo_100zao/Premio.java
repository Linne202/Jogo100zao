package jogo_100zao;

/**
 * 
 * @author linne202
 * @since 20230211
 */

import java.util.Random;

public class Premio {

	public static double calcularPremioFinal(double premioAcumulado) {

		double taxa = new Random().nextDouble(0.50, 3.00);
		double premioFinal = premioAcumulado * taxa / 100;
		return premioFinal;
	}

}
