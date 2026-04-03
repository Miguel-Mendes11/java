package blocosinicializacao.teste;
import blocosinicializacao.dominio.Anime;
public class Animeteste {
    public static void main(String[] args){
        Anime anime = new Anime("Haikyuu");
        System.out.println(anime.getNome());
        Anime anime2 = new Anime();
        
    }
}
