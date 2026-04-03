package blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
            //ex: ep[0] = 1, ep[1] = 2, ep[2] = 3
        }
        for (int episodio : episodios){
            System.out.print(episodio+" ");
        }
    }

    public String getNome(){
        return this.nome;
    }
}
