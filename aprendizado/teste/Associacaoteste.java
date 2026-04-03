package aprendizado.teste;
import aprendizado.dominio.Aluno;
import aprendizado.dominio.Local;
import aprendizado.dominio.Professor;
import aprendizado.dominio.Seminario;
public class Associacaoteste {
    public static void main(String[] args) {
        //Scanner input = new Scanner (System.in);
        //Adicionar o programa com o input depois
        Aluno aluno = new Aluno("Luffy", 19);
        Local local = new Local("Rua dos piratas");
        Aluno[] paraseminario = {aluno};
        Seminario seminario = new Seminario("One Piece", paraseminario, local);
        Seminario[] seminarios = {seminario};
        Professor professor = new Professor("Rayleigh", "Física", seminarios); 
        professor.setSeminarios(seminarios);
        professor.imprime();

    }
}
