package aula;

public class condicionais {
    /**
     * @param args
     */
    public static void main(String[] args){
        var age = 80;
        String permissao;
        // if ( 70 >= age && age >= 18) {
        //System.out.println("Sua idade equivalente a "+age+" lhe permite a consumir bebidas alcólicas");
        //} else if (age < 18) {
        //System.out.println("Sua idade equivalente a "+age+" não lhe permite a consumir bebidas alcólicas");
        //} else {
        //System.out.println("Sua idade equivalente a "+age+" é inválida para o consumo de tal bebida");
        //}
        if (70 >= age && age <= 18){
            permissao = "Permitido a ingestão de bebidas alcólicas para a idade "+age;
        } else if (age<18){
            permissao = "Não permitido a ingestão de bebidas alcólicas para a idade "+age;
        } else {
            permissao = "Idade "+age+" é inválida para o consumo de tal bebida";
        }
        System.out.println(permissao);

        var salarioanual = 58988;
        var taxa1 = 9.8/100;
        var taxa2 = 37.82/100;
        var taxa3 = 49.5/100;
        double imposto;
        if (salarioanual <= 34712){
            imposto = salarioanual*taxa1;
        } else if (68587 >= salarioanual && salarioanual > 34712){
            imposto = salarioanual*taxa2;
        }   else {
            imposto = salarioanual*taxa3;
        }
        System.out.printf("O valor do imposto é: %.2f%n", imposto);

        var dia = 5;
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Opção inválida");
                break;            
                    
        }
        String sexo = "M";
            switch(sexo){
                case "M":
                    System.out.println("Masculino");
                    break;
                case "F":
                    System.out.println("Feminino");
                    break;  
            }

        var day = 1;
        switch(day){
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            case 7, 1:
                System.out.println("Fim de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;            
                    
        }

        





    }
    
}
