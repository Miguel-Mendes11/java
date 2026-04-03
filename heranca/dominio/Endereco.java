package heranca.dominio;

public class Endereco {
    private String rua;
    private int cep;

    public void X(){
        Pessoa p = new Pessoa("rodrigo");
        //é possivel acessar os atributos com protected da classe Pessoa mesmo sem ser uma classe filha, 
        // pois a classe Endereco está no mesmo pacote da classe Pessoa, ou seja, a classe Endereco é uma classe do mesmo pacote da classe Pessoa, 
        // e por isso, é possível acessar os atributos com protected da classe Pessoa.
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }


}
