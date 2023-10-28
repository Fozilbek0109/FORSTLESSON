package telefonkampyuter;

import java.util.Scanner;

public class Kampyuter {


    protected String name;
    protected int pamyat;
    protected int yili;
    static void qidirish(String[] massiv, int c, String mat) { //qidirish materiali bo'yicha
        for (int i = 0; i < c; i++) {
            if (massiv[i] == mat) {
                System.out.println(massiv[i]);
            }
        }
    }

    void ozgartirish(String name, int pamyat, int yili) {
        this.name = name;
        this.yili = yili;
        this.pamyat = pamyat;
    }
    static void saralash(int[] a, int n){
        for (int i=0;i < n;i++){
            for (int j=0;j < n;j++){
                if (a[i] > a[j]){
                int k = a[i];
                a[i] = a[j];
                a[i] = k;
                }
            }
        }
    }



}