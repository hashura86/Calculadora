package CalculadoraOO;

//import MyException.DividirPorZeroException;
import Operacoes.*;
import interfaces.*;
import java.util.Scanner;

public class GerarCalculos {

    public static void geraCalculoSimples() {    
        Calculadora c = Calculadora.GetInstanciaCalculadora();      
        Double n1, n2;
        char op;
        Scanner in = new Scanner(System.in);
        System.out.println("\ninforme o primeiro numero:");
        n1 = in.nextDouble();
        c.setNumero1(n1);
        System.out.println("\ninforme o segundo numero:");
        n2 = in.nextDouble();
        c.setNumero2(n2);
        System.out.println("\ninforme o operador:");
        op = in.next().charAt(0);
        in.nextLine();
        while (ChecaOperacao.checaOperador(op)) {
            System.out.println("\noperador incorreto, tente novamente");
            op = in.next().charAt(0);
        }
        c.setOperador(op);
        c.enviarMenssagem(" foram aceitos e serão calculados... \nResultado:");

        switch (c.getOperador()) {
            case '+':
                iSoma sum = new Soma();
                System.out.println(sum.calcular(n1, n2));
                break;
            case '-':
                iSubtracao isub = new Subtracao();
                System.out.println(isub.calcular(n1, n2));
                break;
            case '*':
                iMultiplicacao imult = new Multiplicacao();
                System.out.println(imult.calcular(n1, n2));
                break;
            case '/':
                iDivisao idiv = new Divisao();
                System.out.println(idiv.calcular(n1, n2));   
                break;
            case 'r':
                Radiciacao rad = new Radiciacao();
                System.out.println(rad.calcular(n1, n2));
                break;
            case '^':
                Exponenciacao exp = new Exponenciacao();
                System.out.println(exp.calcular(n1, n2));
                break;
            default:
                System.out.println("não identificado");
                break;
        }
    }
}
