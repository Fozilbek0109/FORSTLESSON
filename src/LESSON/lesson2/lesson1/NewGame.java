package LESSON.lesson2.lesson1;

import java.util.Random;
import java.util.Scanner;

public class NewGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        int chooseUser = 0;
        while (a) {
            System.out.println("1-> Start Game\n2-> Exit game");
            try {
                chooseUser = sc.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("sizda htolik mavjud iltimos to'g'ri kiriting");
            } finally {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("1-> Start Game\n2-> Exit game");
                int chooseUser1 = sc1.nextInt();
                switch (chooseUser1) {
                    case 1:
                        Level[] l = Level.values();
                        for (int i = 0; i < l.length; i++) {
                            System.out.println(i + 1 + "->" + l[i]);
                        }
                        int chooselevel1 = sc.nextInt() - 1;

                        Level lvl = l[chooselevel1];

                        switch (lvl) {
                            case Low:
                                Main.setMax(10);
                                break;
                            case Medium:
                                Main.setMax(100);
                                break;
                            case High:
                                Main.setMax(1000);
                                break;
                            default:
                                System.out.println("Siz mavjud bo'lmagan levelni tanladingiz iltimos boshqattan tanlag");
                        }
                        break;
                    case 2:
                        a = false;
                        System.out.println("O'yin tugadi");
                        break;
                    default:
                        System.out.println("Siz mavjud bo'lmagan qatorni tanladingiz iltimos boshqattan tanlang");

                }

            }

        }
        switch (chooseUser) {
            case 1:
                Level[] l = Level.values();
                for (int i = 0; i < l.length; i++) {
                    System.out.println(i + 1 + "->" + l[i]);
                }
                int chooselevel1 = sc.nextInt() - 1;

                Level lvl = l[chooselevel1];

                switch (lvl) {
                    case Low:
                        Main.setMax(10);
                        break;
                    case Medium:
                        Main.setMax(100);
                        break;
                    case High:
                        Main.setMax(1000);
                        break;
                    default:
                        System.out.println("Siz mavjud bo'lmagan levelni tanladingiz iltimos boshqattan tanlag");

                }

                break;
            case 2:
                a = false;
                System.out.println("O'yin tugadi");
                break;
            default:
                System.out.println("Siz mavjud bo'lmagan qatorni tanladingiz iltimos boshqattan tanlang");

        }
    }
}



