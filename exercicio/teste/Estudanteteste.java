package exercicio.teste;
import exercicio.dominio.Estudante;
import exercicio.dominio.Impressora;
public class Estudanteteste{
    public static void main (String[] args){
        Estudante estudante = new Estudante();
        Impressora imprime = new Impressora();
        estudante.nome = "Ana Júlia";
        estudante.idade = 18;
        estudante.sexo = 'F';
        estudante.altura = 1.56;
        estudante.nota = new double[]{8.5, 9.0, 7.5};
        imprime.imprimir(estudante);
        imprime.media(estudante.nota);
    }
}