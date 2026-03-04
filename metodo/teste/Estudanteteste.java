package metodo.teste;
import metodo.dominio.Estudante;
import metodo.dominio.Impressoraestudante;
public class Estudanteteste {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Impressoraestudante impressora = new Impressoraestudante();
        estudante1.nome = "Miguel";
        estudante1.idade = 17;
        estudante1.sexo = 'M';
        estudante2.nome = "Ana";
        estudante2.idade = 18;
        estudante2.sexo = 'F';
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
        
    }
    
}
