package telefonkampyuter1;

import java.util.Scanner;

public class Main1 {
    protected String name;
    protected int pamyat;
    protected int yili;

    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nechta kampiyuter haqida malumot kiritmoqchisiz");
        int n = sc.nextInt();
        System.out.println(n);
        int[] s = new int[n];
        if (s.length == n) {
            for (int i = 0; i < n; i++) {
                System.out.println("Kompyuterlar haqida malumotlar kiriting");
                System.out.println("kampyuter nomi" + name);
                System.out.println("kampyuter yili" + yili);
                System.out.println("kampyuter hotirasi"+ pamyat);
                s[i]  = s[Integer.parseInt(name,+yili+pamyat)];
            }
            System.out.println("kampyuterlarni saralash yili boyicha");

        }
    }
}