package Operacoes;

import interfaces.Strategy;

public class Exponenciacao extends OperacaoBasica implements Strategy{
    @Override
    public double calcular(double x, double y) {
        return (Math.pow(x, y));
    }
}
