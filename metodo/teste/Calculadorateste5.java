package metodo.teste;
import metodo.dominio.Calculadora;
public class Calculadorateste5 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somalistas(numeros);
        calculadora.somavarargs(1,2,3,4,5,6,7,8);
    }
    
}
