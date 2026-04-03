package modificadorstatic.dominio;

 public class Carro {
    private String nome;
    private double velocidademax;
    private static double velocidadelim = 250;

    public Carro(String nome, double velocidademax){
        this.nome = nome;
        this.velocidademax = velocidademax;
        
    }

    //obs: não se pode acessar uma variável de instância(não estática) dentro de um método static, pois o static pertence a classe e não ao objeto, e a variável de instância pertence ao objeto.
    //objetos são instâncias da classe - (new), e o static pertence a classe, ou seja, é compartilhado por todos os objetos da classe.
    //pode ser usar variáveis estáticas dentro de métodos não estáticos, pois o método não estático pertence ao objeto, e o objeto tem acesso a todas as variáveis da classe, inclusive as estáticas.
    public static void setVelocidadelim(double velocidadelim){
        Carro.velocidadelim = velocidadelim;
    }

    public static double getVelocidadelim(){
        return Carro.velocidadelim;
    }

    public void imprime(){
        System.out.println("------------------------------------------");
        System.out.println("Nome do veículo: "+this.nome);
        System.out.println("Velocidade máxima do veículo: "+this.velocidademax);
        System.out.println("Velocidade limite do veículo: "+velocidadelim);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVelmax(double velocidademax){
        this.velocidademax = velocidademax;
    }

    public double getVelmax(){
        return this.velocidademax;
    }


}

