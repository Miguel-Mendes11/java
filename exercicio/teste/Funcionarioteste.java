package exercicio.teste;
import exercicio.dominio.Funcionario;
public class Funcionarioteste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(); 
        funcionario.setNome("Miguel");
        funcionario.setIdade(17);
        funcionario.setSalario(new double[]{2500, 3000, 3500}); 
        funcionario.imprime(); 
        System.out.println("Media: " + funcionario.getMedia());
        //funcionario.media(funcionario.salario); funciona no uso dos dois métodos
        //System.out.println(funcionario.getMedia());
    }

}
