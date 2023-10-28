package telefonkampyuter1;

import java.util.Scanner;

public class Kampyuter {
    protected String name;
    protected int pamyat;
    protected int yili;

    public Kampyuter(String name, int pamyat, int yili, Scanner sc, int a) {
        this.name = name;
        this.pamyat = pamyat;
        this.yili = yili;

    }

    void ozgartirish(String name, int pamyat, int yili){
        this.name=name;
        this.yili=yili;
        this.pamyat=pamyat;
    }

    static void qidirish(String [] massiv, int c,String name) { //qidirish nomi boyicha bo'yicha
        for (int i = 0; i < c; i++) {
            if (massiv[i]== name) {
                System.out.println(massiv[i]);

            }
        }

    }
    static void Saralash(int[] massiv, int y, String name) {
        for (int i = 0; i < y; i++) {
            for (int j = i + 1; j < y; j++) {
                if (massiv[i] > massiv[j]) {
                    System.out.println(massiv[i] + massiv[j]);
                }
            }
        }
    }


}
