package aula;

public class array {
    public static void main(String[] args){
        //padrão inicialização
        // byte, short, int, long, float && double 0
        // boolean false
        // char ''
        // String null
        int [] idades = new int[3];
        idades[2] = 89;
        idades[1] = 65;
        idades[0] = 51;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);

        String [] nomes = new String[5];
        nomes[0] = "naruto";
        nomes[1] = "ichigo";
        nomes[2] = "luffy";
        nomes[3] = "goku";
        nomes[4] = "vargas";

        String [] animes = new String[5];
        animes[0] = "Naruto Shippuden";
        animes[1] = "Bleach";
        animes[2] = "One Piece";
        animes[3] = "Dragon Ball";
        animes[4] = "Era Vargas";
        
        for(int y=0; y<nomes.length; y++){
            System.out.println("O protagonista do anime " +animes[y]+" se chama "+nomes[y]);
        }

        //ideal para informações pré estabelecidas, caso não, evitar utilizar
        int [] number = {1,3,8,42,76,354};
        for (int i=0; i < number.length; i++){
            System.out.println(number[i]);
        }

        //FOREACH
        for (int num:number){
            System.out.println(num);
        }


    }
    
}
