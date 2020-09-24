package CalculadoraOO;

public class Status extends CalculadoraInfo{

    @Override
    void inicializar() {
        System.out.println("A calculadora agora está ligada");
    }

    @Override
    void desligar() {
        System.out.println("A calculadora foi desligada");
    }
    
}
