package associacao.teste;
import associacao.dominio.Jogador;
public class Jogadorteste1 {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("CR7");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        //Tanto pelé, Messi e CR7 podem ser identificados como jogador 1, 2 ou 3 e também como integrantes do array jogadores, cada um em uma posição distinta
        for (Jogador jogador : jogadores){
            jogador.imprime();
        }
        

    }
}
