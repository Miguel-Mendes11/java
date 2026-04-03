package associacao.teste;
import associacao.dominio.Jogador; 
import associacao.dominio.Time;
public class Jogadorteste2 {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador("Ronaldo");
        Time time = new Time("Real Madrid");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
