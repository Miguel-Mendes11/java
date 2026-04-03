package associacao.teste;

import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Informe seu nome: ");
    String nome = input.nextLine();
    System.out.print("Informe sua idade: ");
    int idade = input.nextInt();
    input.nextLine(); // consume newline
    System.out.print("Informe seu sexo (Masculino - M | Feminino - F): ");
    String sexo = input.nextLine();    
    if ("M".equals(sexo)){
        sexo = "Masculino";
    }
    else if ("F".equals(sexo)) {
        sexo = "Feminino";
    }
    System.out.print("Olá "+nome+", sua idade registrada é de "+idade+" anos e seu sexo é "+sexo);

    }
}