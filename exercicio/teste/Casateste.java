package exercicio.teste;
import exercicio.dominio.Casa;
public class Casateste {
    public static void main(String[]args){
        Casa casa = new Casa();
        casa.rua = "Rua barão de melgaço";
        casa.cep = 52120590;
        casa.num = 107;
        casa.valor = new double[]{320000, 360000, 310000};
        casa.informa(casa);
        casa.valorchave(casa.valor);

    }
}
