package zadachi_2_5_str274;

import java.util.LinkedList;

public class str_274_zadacha_4 {

    public static void main(String[] args) {

        LinkedList<Integer> myLL = new LinkedList<>();

        myLL.addLast(10);
        myLL.addLast(15);
        myLL.addLast(90);
        myLL.addLast(5);
        myLL.addLast(25);
        myLL.addLast(80);
        myLL.addLast(55);
        myLL.addLast(60);
        myLL.addLast(45);
        myLL.addLast(70);
        myLL.addLast(30);
        myLL.addLast(35);

        int x = 50;

        System.out.println(myLL);

        int y = 0;
        int k = myLL.size();
        int schet = 0;
        while (y < k) {
            schet++;
            if (myLL.get(y) > x) {
                int buf = myLL.get(y);
                myLL.remove(y);
                myLL.addLast(buf);
                System.out.println(myLL);
            } else {
                y++;
            }
            if (schet == myLL.size()) {
                break;
            }
        }
        System.out.println(myLL);
    }
}


