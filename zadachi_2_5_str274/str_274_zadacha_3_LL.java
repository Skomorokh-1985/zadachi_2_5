package zadachi_2_5_str274;

import java.util.Iterator;
import java.util.LinkedList;

public class str_274_zadacha_3_LL {

    public static void main(String[] args) {

        int n = 15;
        LinkedList<Integer> myLL = new LinkedList<>();
        int x = 1;
        for (int i = 0; i < n; i++) {
            myLL.add(x++);
        }
        System.out.println(myLL);

        int k = 0;
        Iterator<Integer> iter = myLL.iterator();
        while (myLL.size() > 1) {
            if(iter.hasNext()) {
                iter.next();
                k++;
                if(k == 2) {
                    iter.remove();
                    k = 0;
                    System.out.println(myLL);
                }
            }
            else {
                iter = myLL.iterator();
            }
        }
    }
}