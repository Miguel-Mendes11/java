package modificadorstatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 1 - alocado espaço em memória para o objeto anime
        // 2 - cada atributo é criado e inicializado com valores default (null, 0, false)
        // 3 - bloco de inicialização é executado
        // 4 - construtor é executado
    
        //bloco de inicialização
    static{
        System.out.println("dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
            System.out.print(episodios[i]+" ");
        }
            //ex: ep[0] = 1, ep[1] = 2, ep[2] = 3

    }
    //public Anime(String nome){
        //this.nome = nome;
    //}

    //public Anime(){
       // episodios = new int[100];
        //for (int i = 0; i < episodios.length; i++){
            //episodios[i] = i+1;
            //ex: ep[0] = 1, ep[1] = 2, ep[2] = 3
        //}
        //for (int episodio : Anime.episodios){
            //System.out.print(episodio+" ");
        //}
    //}

    public String getNome(){
        return this.nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
