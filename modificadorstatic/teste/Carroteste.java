package modificadorstatic.teste;
import modificadorstatic.dominio.Carro;
public class Carroteste {
    public static void main(String[] args){
        Carro carro1 = new Carro("Fusca", 360);
        Carro carro2 = new Carro("Gol", 280);
        Carro carro3 = new Carro("Grand Siena", 320);
        //carro1.setVellim(392);
        //Com o static, a alteração do valor de uma variável em um objeto, altera o valor para todos os objetos da classe.
        //Carro.velocidadelim = 392;
        //Pondo o nome da classe antes da variável, conseguimos acessar a variável sem precisar criar um objeto, pois o static pertence a classe e não ao objeto.
        Carro.setVelocidadelim(392);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
       
    }
}
