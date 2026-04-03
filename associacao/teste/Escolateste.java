package associacao.teste;
import associacao.dominio.Professor;
import associacao.dominio.Escola;
public class Escolateste {
    public static void main(String[] args) {
        Professor professor = new Professor("Leandro");
        Professor[] professores = {professor};
        Escola escola = new Escola("Escola Estadual Porto Digital", professores);
        escola.imprime();
    }
}
