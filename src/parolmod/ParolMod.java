package parolmod;

import java.util.Random;

public class ParolMod {
    public static void main(String[] args) {
        Random random = new Random();
        boolean b = true;
        int count = 0;
        while (b) {
            int a1 = random.nextInt(0, 9);
            int a2 = random.nextInt(0, 9);
            int a3 = random.nextInt(0, 9);
            int a4 = random.nextInt(0, 9);

            String s = a1+""+a2+""+a3+""+a4;
            System.out.println(s);
            System.out.println("Enter");
            count++;
            if (s.equalsIgnoreCase("1234")){
                b = false;
                System.out.println("parol " +s);
            }
        }
        System.out.println(count+" chi urinishda parol topildi");
    }
}
