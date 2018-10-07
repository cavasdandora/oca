package Cap3;

import java.util.ArrayList;
import java.util.List;

public class Questions {
//------------------------------------------

 public static void main(String[] args) {
             int numFish = 4;
             String fishType = "tuna";
          //  String anotherFish = numFish + 1;
          //   System.out.println(anotherFish + " " + fishType);
          //   System.out.println(numFish + " " + 1);



      StringBuilder sb = new StringBuilder();
      sb.append("aaa").insert(1, "bb").insert(4, "ccc"); //abbaccca
      System.out.println(sb);

      int total = 0;
      StringBuilder letters = new StringBuilder("abcdefg");
      total += letters.substring(1, 2).length(); //0+b = 2
      total += letters.substring(6, 6).length();// 2+
    //  total += letters.substring(6, 5).length();//er
      System.out.println(total);


      StringBuilder puzzle = new StringBuilder("Java");
//      puzzle.reverse();
//     System.out.println(puzzle);
      puzzle.append("vaJ$").substring(0,4);
     System.out.println(puzzle);
//      puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
//      puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
 //     System.out.println(puzzle);


      List<String> list = new ArrayList<String>();
      list.add("one");
      list.add("two");
      list.add("7");
      for(String s : list) System.out.print(s);
                  }
}
