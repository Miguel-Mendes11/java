package Modificadorfinal.dominio;

public  class Carro {
    //ao usar final, não posso ter uma clase que herde de carro
    private String nome; 
    public static final double VELOCIDADE_LIMITE; //o  modificador final impossibilita o uso de qualquer atribuição a variável a não ser a public.
    //ou eu uso static, mantendo static para o bloco de inicialização e para Carroteste1 mantenho Carro.VELOCIDADE_LIMITE, ou eu retiro o static, pondo o bloco de inicialização normal e coloco carro.VELOCIDADE_LIMITE
    public final Comprador COMPRADOR = new Comprador(); //o modificador final impossibilita a atribuição de um novo objeto a variável comprador, mas é possível modificar os atributos do objeto comprador, pois o modificador final não torna o objeto imutável, apenas a referência da variável.

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public void imprime(){
        //ao usar final, não posso ter um método que seja sobrescrito em uma classe filha, ou seja, não posso ter um método imprime() na classe Ferrari
        System.out.println(this.nome);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

}
