package associacao.dominio;

public class Time {
    private Jogador[] jogadores;
    private String nome;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(Jogador[] jogadores){
        this.jogadores = jogadores;
    }

    public void Imprime(){
        System.out.println("Nome do time: " + this.nome);
        if (jogadores == null){ return;}
        for(Jogador jogador : jogadores){
            System.out.println(jogador.getNome());
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Jogador[] getJogadores(){
        return this.jogadores;
    }

    public void setJogadores(Jogador[] jogadores){
        this.jogadores = jogadores;
    }

}
