package Cap3;

public class MatrixInverse {

    public static void printArray(int[][] multiArray1) {

        for (int i = 0; i < multiArray1.length; i++) {
            for (int j = 0; j < multiArray1[i].length; j++) {
                System.out.print(multiArray1[i][j] + "\t");
            }
            System.out.println();
        }
        int result =0;
        if (multiArray1.length == 2) {
            result = ((multiArray1[0][0] * multiArray1[1][1]) - (multiArray1[0][1] * multiArray1[1][0]));
          System.out.println(result);
        }
    }




    public static void main(String[] args) {

        int[][] multiArray1 = {{1,2}, {3,4}};
        MatrixInverse mx = new MatrixInverse();
         mx.printArray(multiArray1);



    }
}


