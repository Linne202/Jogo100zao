package jogo_100zao;

/**	
 * @author wiu0
 * @author Linne202
 * @since 20230216
 */

import java.util.concurrent.ThreadLocalRandom;

public class TaxaDesistencia {

	public static String premioAcumulado;

	public static double calcularPremioFinal(double premioAcumulado) {

		double taxa = ThreadLocalRandom.current().nextDouble(10, 35);
		double valorDesconto = premioAcumulado * taxa/100;
		premioAcumulado = premioAcumulado - valorDesconto;
		return premioAcumulado;
	}
}
