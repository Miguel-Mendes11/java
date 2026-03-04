package metodo.dominio;
public class Calculadora{
    public void soma(){
        System.out.println(10 + 10);
    }
    public void multiplicacao(){
        System.out.println(10*32);

    }
    public void divisao(int num1, int num2){
        System.out.println(num1/num2);
    }
    public double divide(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public void altera(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera-dominio");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
    public void somalistas(int[] numeros){
        int soma =0;
        for (int num:numeros){
            soma +=num;
        }
    }
    public void somavarargs(int... numeros){
        int soma =0;
        for (int num:numeros){
            soma +=num;
        }
        System.out.println("Soma: " + soma);
    }
}    