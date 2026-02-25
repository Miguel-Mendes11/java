package aula;

public class laçosderepeticao {
    public static void main(String[] args){
        int x = 0;
        while (x < 10){
            System.out.println("O valor de x é: "+ ++x);
        }
        x = 0;

        do{
            System.out.println("O valor de x é: "+ ++x);
        }while(x < 20);

        for (int i = 1; i <= 10; i++){
            System.out.println("O valor de i é: "+ i);
        }

        int max = 100;
        for (int y = 1; y <= max; y++){
            if (y <= 50){
                System.out.println(y);
            } else{
                break;
            }
        }

        int x1 = 87000;
        for (int p = 1; p <= x1; p+=1){
            var valorparcela = x1/p;
            if(valorparcela >= 1000){
                System.out.println("Parcela "+p+" R$"+valorparcela);
            }else {
                break;
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip even numbers
            }
            System.out.println(i);  // Only prints odd numbers
        }
// Output: 1, 3, 5, 7, 9
            
    }


        

}
