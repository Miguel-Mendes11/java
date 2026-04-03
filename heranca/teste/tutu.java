package heranca.teste;
import heranca.dominio.Pessoa;

public class tutu extends Pessoa {

    public tutu(String nome) {
        super(nome);
    }

    public void Teste(){
        this.nome = "Rodrigo";
    }
    //fora do pacote, só é possível acessar os atributos protected sendo uma classe filha, ou seja, uma classe que herda da classe pai, 
    // nesse caso, a classe funcionario herda da classe pessoa, e por isso, é possível acessar os atributos protected da classe pessoa.
}
