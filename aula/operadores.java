package aula;

public class operadores {
    public static void main(String[] args)
    {
        var a = 10;
        var b = 5;
        var c = a + b; // adição
        var d = a - b; // subtração
        var e = a * b; // multiplicação
        var f = a / b; // divisão
        var g = a % b; // módulo
        System.out.println("Adição: " + c);
        System.out.println("Subtração: " + d);
        System.out.println("Multiplicação: " + e);
        System.out.println("Divisão: " + f);
        System.out.println("Módulo: " + g);
        if (a%2 == 0) {
            System.out.println("O valor "+a+" é par");
        } else if (a%2 != 0) {
            System.out.println("O valor "+a+" é ímpar");
        }
        boolean x1 = 10 > 20;
        System.out.println("10 é maior que 20? "+x1);
        boolean x2 = 20 > 10;
        System.out.println("20 é maior que 10? "+x2);
        boolean x3 = 10 == 10;
        System.out.println("10 é igual a 10? "+x3);
        boolean x4 = 10 != 10;
        System.out.println("10 é diferente de 10? "+x4);
        int idade = 35;
        double salario = 3580;
        boolean leisalarial = idade > 30 && salario > 4612;
        System.out.println("A pessoa está dentro da lei salarial? "+ leisalarial);
         
        double valorcorrente = 200;
        double valorpoupanca = 5000;
        double valorps5 = 3200;
        boolean podecomprarps5 = valorcorrente > valorps5 || valorpoupanca > valorps5;
        System.out.println("Posso comprar o Ps5 painho? "+podecomprarps5);
    }
}
