package LESSON.lesson2.lesson3;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public  void ishla(){
        System.out.println("ishlayappman");
    }
    public void Ishlay(){
        Scanner sc = new Scanner(System.in);
        int anInt = sc.nextInt();
        System.out.println(anInt +" " + "marta ishlayappan");

    }

}
