package src.Cap4;


/**
 *
 */
public class Substring {

    public static void main(String[] args){
        String rowFound = "corporationId\" value=\"";
        int a = rowFound.indexOf('"');
        int b = rowFound.lastIndexOf('"');
         System.out.println("a:"+a);
        System.out.println("b:"+b);
        String result = rowFound.substring(a,b);
         System.out.println("result:"+result);


    }
}
