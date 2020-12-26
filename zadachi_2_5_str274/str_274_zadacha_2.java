package zadachi_2_5_str274;

import java.util.LinkedList;

public class str_274_zadacha_2 {

    public static void main(String[] args) {

        LinkedList<Integer> myLL = new LinkedList<>();

        myLL.addLast(-1);
        myLL.addLast(-2);
        myLL.addLast(-3);
        myLL.addLast(-4);
        myLL.addLast(-5);
        myLL.addLast(5);
        myLL.addLast(4);
        myLL.addLast(3);
        myLL.addLast(2);
        myLL.addLast(1);
        myLL.addLast(-9);
        myLL.addLast(9);

        System.out.println(myLL.toString());

        int y = 0;
        int k = myLL.size();
        int schet = 0;
        while (y < k) {
            System.out.println();
            System.out.print(" schet = " + schet++);
            if (myLL.get(y) < 0) {
                System.out.print(", y = " + y);
                int buf = myLL.get(y);
                System.out.println(", buf = " + buf);
                myLL.remove(y);
                myLL.addLast(buf);
                System.out.println(myLL.toString());
            } else {
                y++;
            }
            if (schet == myLL.size()) {
                break;
            }
        }
        System.out.println();
        System.out.println(myLL.toString());
    }
}
