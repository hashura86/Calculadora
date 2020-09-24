package Operacoes;

import interfaces.iSoma;

public class Soma extends OperacaoBasica implements iSoma {
    @Override
    public double calcular(double x, double y) {
        return x + y;
    }
    
    
}
