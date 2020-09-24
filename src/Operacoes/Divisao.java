package Operacoes;

import interfaces.iDivisao;

public class Divisao extends OperacaoBasica implements iDivisao {
    @Override
    public double calcular(double x, double y) {
        return x / y;
    }

}
