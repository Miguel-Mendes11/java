package aula;
public class aulavariaveis {
    public static void main(String[] args) {
        // int, double, boolean, byte, short, long, float char
        int idade = (int) 25000000000l;
        double salario = 2500.50;
        float valor = 2000.8f;
        boolean estudante = true;
        long populacaomundial = 8000000000L;
        long n2 = (long) 300.67;
        byte number = 126;
        var nome = "Miguel Mendes";
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Estudante: " + estudante);
        System.out.println("População mundial: " + populacaomundial);
        System.out.println("O dobro da idade é: " + idade*2);
        System.out.println(n2);
        System.out.println(nome);
    }
}