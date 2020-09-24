
package Operacoes;

public class ChecaOperacao {
    
    public static boolean checaOperador(char operador) {
        return operador != '+' && operador != '-' && operador != '*' && operador != '/' && operador != 'r' && operador != '^';
    }
    
}
