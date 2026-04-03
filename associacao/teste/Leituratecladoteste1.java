package associacao.teste;

import java.util.Scanner;

public class Leituratecladoteste1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo: ");
        String nome = input.nextLine();
        System.out.println("Digite sua idade abaixo: ");
        int idade = input.nextInt();
        System.out.println("Digite seu sexo abaixo(M ou F): ");
        char sexo = input.next().charAt(0);
        System.out.println("Olá, " + nome + "! Sua idade é " + idade + " e seu sexo é " + sexo);
    }
}
