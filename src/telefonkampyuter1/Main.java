package telefonkampyuter1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String c = sc.next();
        String[] b = new String[sc.nextInt()];
        System.out.println("nomlarni kiriting\n");
        Kampyuter.qidirish(b,a,c);
        int[] d = new int[sc.nextInt()];
        Kampyuter.Saralash(d,a,c);

    }
}
