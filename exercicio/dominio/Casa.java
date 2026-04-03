package exercicio.dominio;

public class Casa {
    public String rua;
    public int cep;
    public int num;
    public double[] valor;

    public void informa(Casa casa){
        System.out.println(casa.rua);
        System.out.println(casa.num);
        System.out.println(casa.cep);
        System.out.println(casa.valor[0]+casa.valor[1]+casa.valor[2]);

    }
    public void valorchave(double[] valor){
        double soma = 0;
        for (double num:valor){
            soma+=num;
        }
        soma = soma/valor.length;
        System.out.println(soma);
    }

}
