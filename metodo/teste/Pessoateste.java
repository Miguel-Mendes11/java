package metodo.teste;
import metodo.dominio.Pessoa;
public class Pessoateste {
    public static void main(String[]args){
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Neymar Jr.";
        //pessoa.idade = 34;
        pessoa.setNome("Neymar Jr.");
        pessoa.setIdade(34);
        //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        
    }

    
    
}
