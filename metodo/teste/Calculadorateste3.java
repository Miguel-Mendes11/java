package metodo.teste;
import metodo.dominio.Calculadora;
public class Calculadorateste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divide(42, 5);
        System.out.println(resultado);
    }
    
}
