package CalculadoraOO;

public class Calculadora {

    private double numero1;
    private double numero2;
    private char operador;
    
    private static Calculadora instancia_calculadora = null;
    
    public static Calculadora GetInstanciaCalculadora() {
        if (instancia_calculadora == null) {
            instancia_calculadora = new Calculadora();
        }
        return instancia_calculadora;
    }

    private Calculadora() {
        
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    @Override
    public String toString() {
        return "numero1 = " + numero1 + "\n numero2 = " + numero2 + "\n operador=" + operador;
    }
    
    public void enviarMenssagem(String menssagem){
      Mediador.mostrarMenssagem(this,menssagem);
   }
    
}
