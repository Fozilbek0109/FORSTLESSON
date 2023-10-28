package exseption;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] massive = new int[10];
            massive[0] = 544;
            massive[1] = 544;
            massive[2] = 544;
            massive[3] = 544;
            System.out.println(massive[11]);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Kod Xatolikga uchradi");
        }finally {
            System.out.println("Java");
        }


    }


}
