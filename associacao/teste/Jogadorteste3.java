package associacao.teste;
import associacao.dominio.Jogador;
import associacao.dominio.Time;
public class Jogadorteste3 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Marcelo Ajul");
        Jogador jogador2 = new Jogador("Thiago Couto");
        Time time = new Time("Sport Recife");
        Jogador[] jogadores = {jogador1, jogador2};
        jogador1.setTime(time);
        time.setJogadores(jogadores);
        System.out.println("----Jogador----");
        jogador1.imprime();
        System.out.println("----Time----");
        time.Imprime();
    }
}
