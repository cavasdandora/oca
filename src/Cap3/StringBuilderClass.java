package Cap3;

public class StringBuilderClass {
    public static void main(String[] args) {

        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println("without stringbuilder: " + alpha);


        //---------------------
        StringBuilder alpha2 = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++) {
            alpha2.append(current);
        }
        System.out.println("with stringbuilder: " + alpha2);


        //---------------------
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // start+middle
        StringBuilder same = sb.append("+end"); //start+middle+end
        System.out.println(same);


        //---------------------
        StringBuilder a = new StringBuilder("abc");  // a = abc
        StringBuilder b = a.append("de"); // b : abcde a : abcde
        b = b.append("f").append("g"); // b : abcde + f + g : abcdefg
        System.out.println("a=" + a); // a : abcdefg
        System.out.println("b=" + b); // b : abcdefg

        // --------------------- ways to construct StringBuilder
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

        //--------------------- methods: charAt(), indexOf(), length(), substring()

        StringBuilder ab = new StringBuilder("animals");
        String sub = ab.substring(ab.indexOf("a"), ab.indexOf("al")); // (0, 4) ->  anim
        int len = ab.length(); // 7
        char ch = ab.charAt(6); // s
        System.out.print(sub + " " + len + " " + ch); // anim 7 s

        //---------------------    append()

        StringBuilder x = new StringBuilder().append(1).append('c'); //1c
        x.append("-").append(true); // 1c-true
        System.out.print(x);

        //---------------------    insert()

        StringBuilder y = new StringBuilder("animals");
        y.insert(7, "-");   // y : animals-
        y.insert(0, "-");   // y : -animals-
        y.insert(4, "-");   // y : -ani-mals-
        System.out.println(y);

        //---------------------    delete() , deleteCharAt()

        StringBuilder w = new StringBuilder("abcdef");
        w.delete(1, 3); //adef --  index1, ends before 3
        //  w.deleteCharAt(5); // exept

        //---------------------    reverse()
        StringBuilder q = new StringBuilder("ABC");
        q.reverse();
        System.out.println(q);

        //---------------------    toString()  --  StringBuiler to String








    }
}
