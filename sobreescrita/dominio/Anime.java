package sobreescrita.dominio;

public class Anime {
    private String nome;

    @Override
    public String toString(){
        return "O nome do anime é: " + this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
