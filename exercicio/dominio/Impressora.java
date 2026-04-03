package exercicio.dominio;
public class Impressora {

    public void imprimir(Estudante estudante){ 
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println("Altura: "+estudante.altura);
        System.out.print("Notas: "+estudante.nota[0]+", "+estudante.nota[1]+", "+estudante.nota[2]);

    }
    public void media (double[] nota){
        double media = 0;
        double soma = 0;
        for (double num:nota){
            soma += num;
        }
        media = soma/nota.length;
        System.out.printf("A média das notas foi %.2f%n", media);
    }
}
