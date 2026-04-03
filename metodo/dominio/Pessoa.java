package metodo.dominio;
public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(nome);
        System.out.println(idade);
    }
    public void setNome(String name){
        nome = name; 
        //o nome de neymar é atribuido a variavel nome, 
        // ou seja, o valor do parametro nome é atribuido 
        // a variavel nome da classe pessoa e a variavel 
        // nome da classe pessoa é acessada atraves do this.nome
    }
    public void setIdade(int age){
        if (age<0){
            System.out.println("Idade inválida");
            return;
            //return em método void é usado para sair do método antes de chegar ao final
        }
        idade = age;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
}