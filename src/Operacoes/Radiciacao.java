
package Operacoes;

import interfaces.Strategy;

public class Radiciacao extends OperacaoBasica implements Strategy{
    @Override
    public double calcular(double x, double y) {
        return (Math.pow(y, (1 / x)));
    }
}
