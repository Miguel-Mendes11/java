package sobrecargametodos.teste;
import sobrecargametodos.dominio.Anime;
public class Animeteste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Naruto", "TV", 748);
        anime.init("Jujutsu Kaisen", "TV", 97, "Shounen");
        //anime.setNome("Naruto");
        //anime.setTipo("Shounen");
        //anime.setEpisodios(748);
        anime.imprime();
        //sobrecarga de métodos é a junção de dois ou mais métodos com o mesmo nome, mas com parâmetros diferentes, ou seja, a assinatura do método é diferente. O método init é um exemplo de sobrecarga de método, pois ele tem o mesmo nome, mas com parâmetros diferentes. O método imprime é um exemplo de método normal, pois ele não tem parâmetros. A sobrecarga de métodos é uma forma de facilitar a leitura do código, pois ela permite que o programador use o mesmo nome para métodos que realizam a mesma função, mas com parâmetros diferentes.
    }
    
}
