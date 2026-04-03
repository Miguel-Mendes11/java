package heranca.dominio;

public class Funcionario  extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático da classe funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização da classe funcionario 2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor da classe funcionario");
    }

    public void imprime(){
        super.imprime();
        //super chama o metodo da classe pai, ou seja, da classe pessoa, e depois imprime o salario do funcionario.
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o pagamento de " + this.salario);
    } 

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

}
