package CalculadoraOO;

public class Mediador {
    
    public static void mostrarMenssagem(Calculadora c, String message){
      System.out.println(c.getNumero1() +" e "+ c.getNumero2() + message);
   }
}