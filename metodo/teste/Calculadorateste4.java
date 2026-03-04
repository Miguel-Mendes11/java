package metodo.teste;
import metodo.dominio.Calculadora;
public class Calculadorateste4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 29;
        int num2 = 32;
        calculadora.altera(num1, num2);
        System.out.println("Dentro do altera-teste");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    
    }
    
}
