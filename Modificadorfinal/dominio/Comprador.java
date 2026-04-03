package Modificadorfinal.dominio;

public class Comprador {
    private String nome;
    
    @Override
    public String toString(){
        return "O nome do comprador é: " + this.nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
