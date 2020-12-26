package zadachi_2_5_str274;

import java.util.ArrayList;
import java.util.List;

public class str_274_zadacha_5 {

    public static void main(String[] args) {

        List<Integer> myAL = new ArrayList<>();
        myAL.add(5);
        myAL.add(4);
        myAL.add(3);
        myAL.add(2);
        myAL.add(1);
        myAL.add(6);
        myAL.add(7);
        myAL.add(8);
        myAL.add(9);
        myAL.add(2);
        myAL.add(5);
        myAL.add(4);
        myAL.add(4);
        myAL.add(3);
        myAL.add(2);
        myAL.add(1);
        System.out.println(myAL);

        while (myAL.size() > 1) {
            for (int i = 0; i < myAL.size() - 1; i += 2) {
                myAL.set(i, myAL.get(i) + myAL.get(i + 1));
            }

            if (myAL.size() % 2 == 0) {
                for (int i = myAL.size() - 1; i > 0; i -= 2) {
                    myAL.remove(i);
                }
            } else {
                for (int i = myAL.size() - 2; i > 0; i -= 2) {
                    myAL.remove(i);
                }
            }
            System.out.println(myAL);
        }
    }
}
