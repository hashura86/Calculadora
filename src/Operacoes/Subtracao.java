package Operacoes;
import interfaces.iSubtracao;

public class Subtracao extends OperacaoBasica implements iSubtracao{
    @Override
    public double calcular(double x, double y) {
        return x - y;
    }
}
