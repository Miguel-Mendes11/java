package ClasseAbstrata.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String toString(){
        return "Funcionário: " + nome + " Salário: " + salario;
    }



}

