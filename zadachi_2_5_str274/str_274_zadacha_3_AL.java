package zadachi_2_5_str274;

import java.util.ArrayList;
import java.util.Scanner;

public class str_274_zadacha_3_AL {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n Введите количество человек в круге (для визуализации - из чисел 20,24,28,32,36,40,44,48 и т.д.) ");
        int n = scan.nextInt();

        ArrayList<Integer> myAL = new ArrayList<>();
        int x = 1;
        for (int i = 0; i <= n; i++) {
            myAL.add(x++);
        }
        show(myAL);

        int k = 0;
        int r = 0;

        while (r < n) {
            int i = 0;
            while (i < myAL.size()) {
                if (myAL.get(i) > 0) {
                    k++;
                }
                if (k == 2) {
                    myAL.set (i, 0);
                    k = 0;
                    r++;
                }
                i++;
            }
            show(myAL);
        }
    }


    public static void show(ArrayList<Integer> e) {
        int kolStrok = e.size() / 4 + 1;
        int kolStolbcov = (e.size() - kolStrok * 2) / 2 + 2;
        Integer array[][] = new Integer[kolStrok][kolStolbcov];

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }

        int j = 0;
        int l = 0;
        while (j < array[0].length) {
            array[0][j] = e.get(l);
            j++;
            l++;
        }

        int m = 1;
        while (m < array.length) {
            array[m][array[0].length - 1] = e.get(l);
            m++;
            l++;
        }

        int p = array[0].length - 2;
        while (p >= 0) {
            array[array.length - 1][p] = e.get(l);
            p--;
            l++;
        }

        int t = array.length - 2;
        while (t >= 1) {
            array[t][0] = e.get(l);
            t--;
            l++;
        }

        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t\t");
            }
            System.out.println("\n");
        }
    }
}

