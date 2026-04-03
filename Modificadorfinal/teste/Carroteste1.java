package Modificadorfinal.teste;
import Modificadorfinal.dominio.Carro;
import Modificadorfinal.dominio.Ferrari;
//import Modificadorfinal.dominio.Comprador;
public class Carroteste1 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        //Carro.VELOCIDADE_LIMITE = 300; // Erro: não é possível atribuir um valor a uma variável final
        //Comprador comprador2 = new Comprador(); 
        System.out.println("Velocidade limite: " + Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Jetour T1");
        System.out.println(carro.COMPRADOR);
        //Não precisa do getNome(), pois ele vai rodar o toString() do objeto comprador, e o toString() já tem o nome do comprador, 
        // então não precisa do getNome() para mostrar o nome do comprador, basta mostrar o objeto comprador 
        // que ele vai mostrar o nome do comprador. O modificador final não torna o objeto imutável, 
        // apenas a referência da variável, ou seja, não é possível atribuir um novo objeto a variável comprador, 
        // mas é possível modificar os atributos do objeto comprador.
        Ferrari ferrari = new Ferrari();
    }

}                      
