package Cap3;

import java.util.*;
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
            int[]  numbers = {4,1,10};
            Arrays.sort(numbers);
            for(int i = 0; i<numbers.length;i++){
                System.out.println(numbers[i]);
            }

            String[] strings = {"10","5","3","11"};
            Arrays.sort(strings);
            for(String i: strings)      {
                System.out.print(i+ " ");
            }








    }
}
