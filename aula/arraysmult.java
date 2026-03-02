package aula;

public class arraysmult {
    public static void main(String[] args){
        String[][] dias = new String[3][3];
        dias[0][0] = "01/01";
        dias[0][1] = "02/01";
        dias[0][2] = "03/01";
        dias[1][0] = "01/02";
        dias[1][1] = "02/02";
        dias[1][2] = "03/02";
        dias[2][0] = "01/03";
        dias[2][1] = "02/03";
        dias[2][2] = "03/03";
        

        for(int i=0; i<dias.length; i++){
            for(int y=0; y<dias.length; y++){
                System.out.println(dias[i][y]);
            }        
        }

        int[][] arrayint= new int[3][];
       
        //arrayint[0] = new int[2];
        //arrayint[1] = new int[3];
        //arrayint[2] = new int[6];
        //serve pra determinar o espaço especifico de cada cada próprio array dentro de uma parcela de um array(uma das posições)
        arrayint[0] = new int[]{65,7};
        arrayint[1] = new int[]{12, 34, 2};
        arrayint[2] = new int[]{2, 43,11, 98,43, 71};
        //mostrando valores exatos
        int[][] arrayint2 = {{1,2,3},{11,22,33},{111,222,333}};
        //simplificando o código
        
        for(int[] arraybase:arrayint2){
            System.out.println("\n---------");
            for (int num: arraybase){
                System.out.println(num);
            }
        }


    }
}
