package Cap3;

import java.lang.reflect.Array;

public class MultiplyArray {
//
//    public static void printArray(int[][] multiArray1, int[][] multiArray2) {
//        for (int i = 0; i < multiArray1.length; i++) {
//            for (int j = 0; j < multiArray1[i].length; j++) {
//                System.out.print(multiArray1[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < multiArray2.length; i++) {
//            for (int j = 0; j < multiArray2[i].length; j++) {
//                System.out.print(multiArray2[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }

    public static void printMulti(double[][] multiArray1, double[][] multiArray2, double[][] multiArray3) {
        for (int i = 0; i < multiArray1.length; i++) {
            for (int j = 0; j < multiArray2[i].length; j++) {
                for (int x = 0; x < multiArray2[0].length; x++) {
                    multiArray3[i][j] += multiArray1[i][x] * multiArray2[x][j];
                }
                System.out.println(multiArray3[i][j] + "\t");


            }
            System.out.println();

        }}


    public static void main(String[] args) {

        double[][] multiArray1 = {{101.111111, 112.222222}, {103.333333, 214.444444}};
        double[][] multiArray2 = {{117.777777, 822.777777}, {119.999999, 120.999999}};
        double[][] multiArray3 = new double[2][2];

        printMulti(multiArray1, multiArray2, multiArray3);
           // printMulti2(multiArray1, multiArray2, multiArray3);

    }
}
