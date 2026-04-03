package exercicio.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media = 0;
    public String setNome;
    public int setIdade;
    public double[] setSalario;

    //public void imprime(){
        //System.out.println(this.nome);
        //System.out.println(this.idade);
        //System.out.println(this.salario[0]);
        //System.out.println(this.salario[1]);
        //System.out.println(this.salario[2]);
    //}

    //public void media(double[] salario){
        //double soma =0;
        //double media =0;
        //for (double num:salario){
            //soma +=num;
        //}
       // media = soma/salario.length;
        //System.out.println("Media: " + media);
    //}
    //ESSE É O RESUMO/JUNÇÃO DOS DOIS MÉTODOS ACIMA
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        double soma =0;
        //double media =0;
        for (double num:salario){
            soma +=num;
        }
        media = soma/salario.length;
        //System.out.println("Media: " + media);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario(double[] salario){
        this.salario = salario;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double[] getSalario(){
        return salario;
    }

    public double getMedia(){
        return media;
    }




}
