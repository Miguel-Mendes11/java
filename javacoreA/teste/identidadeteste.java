package javacoreA.teste;
import javacoreA.dominio.Estudante;
    public class identidadeteste{
        public static void main(String[] args) {
            Estudante estudante = new Estudante();
            estudante.nome = "Miguel";
            estudante.idade = 17;
            estudante.altura = 1.80;
            estudante.sexo = 'M';
            System.out.println("O nome do estudante é "+estudante.nome);
            System.out.println("A idade do estudante é "+estudante.idade);
            System.out.println("A altura do estudante é "+estudante.altura);
            System.out.println("O sexo do estudante é "+estudante.sexo);
        }
    }
    