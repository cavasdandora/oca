package Cap5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GFG
{
    public static void main(String[] args)
    {
        List al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(10);
        al.add(20);
        al.add(30);

        // Remove elements smaller than 10 using
        // Iterator.remove()
        Iterator itr = al.iterator();
        while (itr.hasNext())
        {
            int x = (Integer)itr.next();
            if (x >= 10)
                al.remove(new Integer(x));
        }

        System.out.println("Modified ArrayList : "
                + al);
    }
}
