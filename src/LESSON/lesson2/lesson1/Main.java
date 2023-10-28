package LESSON.lesson2.lesson1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void setMax(int max){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(max);
        int b = r.nextInt(max);
        int c = r.nextInt(4);
        int RESULT = 0;

        switch (c){
            case 1:
                RESULT = a + b;
                System.out.println(a + "+" + b + "=");
                break;
            case 2:
                RESULT = a - b;
                System.out.println(a + "-" + b + "=");
                break;
            case 3:
                RESULT = a * b;
                System.out.println(a + "*" + b + "=");
                break;
            case 4:
                RESULT = a / b;
                System.out.println(a + "/" + b + "=");
                break;
            default:
                System.out.println("Iltimos berilgan levelni tanlang");
        }

        int userAnsver = sc.nextInt();
        if (userAnsver == RESULT){
            System.out.println("barakalla");
        }else {
            System.out.println("ikkichi");
        }
    }
}