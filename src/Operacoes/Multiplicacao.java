package Operacoes;

import interfaces.iMultiplicacao;

public class Multiplicacao extends OperacaoBasica implements iMultiplicacao{
    @Override
    public double calcular(double x, double y) {
        return x * y;
    }
}
