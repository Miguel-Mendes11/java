package metodo.teste;
import metodo.dominio.Estudante;
public class Estudanteteste2 {
    public static void main(String[] args){
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante1.nome = "Miguel";
        estudante1.idade = 17;
        estudante1.sexo = 'M';
        estudante2.nome = "Ana";
        estudante2.idade = 18;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();

    }
    
}
