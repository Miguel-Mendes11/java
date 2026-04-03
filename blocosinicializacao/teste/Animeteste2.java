package blocosinicializacao.teste;
import blocosinicializacao.dominio.Anime2;
public class Animeteste2 {
    public static void main(String[] args){
        Anime2 anime = new Anime2("Haikyuu");
        System.out.println(anime.getNome());
        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio+" ");
        }
    }
}
