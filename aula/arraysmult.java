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

    }
}
