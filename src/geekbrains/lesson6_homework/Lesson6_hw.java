package geekbrains.lesson6_homework;
import java.util.Random;
public class Lesson6_hw {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Васька");
        Cat cat2 = new Cat("Дымок");

        Dog dog1 = new Dog("Мухтар");
        Dog dog2 = new Dog("Эдрик");

        cat1.animalInfo();
        cat2.animalInfo();

        System.out.println();

        dog1.animalInfo();
        dog2.animalInfo();

        System.out.println();

        System.out.println("Испытание первой собаки:");
        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.9);
        System.out.println();

        System.out.println("Испытание второй собаки:");
        dog2.run(550);
        dog2.swim(11);
        dog2.jump(0.5);
        System.out.println();

        System.out.println("Испытание первого кота:");
        cat1.run(150);
        cat1.swim(10);
        cat1.jump(1.5);
        System.out.println();

        System.out.println("Испытание второго кота:");
        cat2.run(250);
        cat2.swim(0);
        cat2.jump(1);
    }


}