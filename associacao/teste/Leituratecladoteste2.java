package associacao.teste;
import java.util.Scanner;
public class Leituratecladoteste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println(" Previsor do Futuro");
        System.out.println("--------------------");
        System.out.print("Digite sua pergunta e eu responderei com um sim ou não: ");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }
        else{
            System.out.println("NÃO");
        }

    }
}
