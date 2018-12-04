package Cap5;

import java.util.ArrayList;
import java.util.List;

public class CrunchifyIterateThroughList {

    public static void main(String[] argv) {

        // create list
        List<String> cdc = new ArrayList<String>();

        // add 4 different values to list
        cdc.add("dora");
        cdc.add("dan");


        // iterate via "for loop"
        for (String element : cdc) {
            System.out.println(cdc.get(0));

    }}}