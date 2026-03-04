package metodo.dominio;

public class Impressoraestudante {
    public void imprime(Estudante estudante){
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
    }
}
