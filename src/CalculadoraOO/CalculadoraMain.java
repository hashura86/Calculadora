package CalculadoraOO;

import java.util.Scanner;

public class CalculadoraMain {

    public static void showBodmas(){
        System.out.println("B - Brackets - Parenteses");
        System.out.println("O - Orders(of) - Expoentes");
        System.out.println("D - Division - Divisão");
        System.out.println("M - Multiplication - Multiplicação");
        System.out.println("A - Addition - Adição");
        System.out.println("S - Subtraction - Subtração");  
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Status s = new Status();
        int op;
        do {
            System.out.println("\n");
            s.inicializar();
            System.out.println("\n1.cálculo simples");
            System.out.println("2.escrever uma expressão");
            System.out.println("3.duvidas frequentes");
            System.out.println("0.desligar calculadora");
            System.out.println("\nescolha uma opção:");
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    GerarCalculos.geraCalculoSimples();
                    break;

                case 2:
                    String expressao;
                    System.out.println("Informe uma expressão");
                    expressao = in.nextLine();
                    System.out.println("\nResultado: " + Eval.eval(expressao));        
                    break;
                case 3:
                    System.out.println("\nobservação 1:");
                    System.out.print("a opção 'cálculo simples' serve para APENAS para 2 numeros.\n");
                    System.out.println("\nobservação 2:");
                    System.out.print("para calcular a raíz de um número na opção 'calculo simples' use o primeiro\n");
                    System.out.print("número como sendo o índice e o segundo numero como sendo o radicando.\n");
                    System.out.println("\nobservação 3:");
                    System.out.print("a opção 'escrever uma expressão' utiliza a seguinte regra\n");
                    System.out.println();
                    showBodmas();
                    System.out.print("\na opção 'escrever uma expressão' aceita operações com\n");
                    System.out.print("seno(sin),cos(cos),tangente(tan) \n");
                    break;
                case 0:
                    s.desligar();
                    break;
                default:
                    System.out.println("opção inválida");
            }

        } while (op != 0);

    }

}
