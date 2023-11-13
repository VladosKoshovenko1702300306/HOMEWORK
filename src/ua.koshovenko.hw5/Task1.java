package ua.koshovenko.hw5;

public class Task1 {
    public static void  main (String [] args){
        int x = 3;
        int y = 3;
        int [][] arry = new int[x][y];
        int start = 1;

        for (int i = 0; i < x; i++ ){
            for (int j = 0; j < y; j ++){
                arry [i][j]= start;
                start ++;

                if (i % 2 ==1 ){
                    arry [i][j] = -arry[i][j];
                }
            }
        }
        for (int i = 0; i< x; i++){
            for ( int j = 0 ; j < y; j++){
                System.out.println(arry[i][j]);
            }
            System.out.println();
        }

    }
}
