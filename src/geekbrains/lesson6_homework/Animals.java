package geekbrains.lesson6_homework;
import java.util.Random;

 abstract class Animals {

protected String name;
     protected String animal;
     protected int limitRun;
     protected int limitSwim;
     protected double limitJump;
     public Random random = new Random();

     public Animals(String name){
         this.name = name; // имя для питомца
     }

     public void run(int dist) { // информация по испытанию объекта в беге
         if (this.limitRun >= dist) System.out.println(this.animal + " " + this.name + " пробегает: " + dist + " м.");
         else System.out.println(this.animal + " " + this.name + " не может бежать так далеко");
     }

     public void jump(double height) {// информация по испытанию объекта в прыжках
         if (this.limitJump >= height)
             System.out.println(this.animal + " " + this.name + " прыгает: " + height + " м.");
         else System.out.println(this.animal + " " + this.name + " не может прыгнуть так высоко");
     }
     public void swim(int dist) {//информация по испытанию объекта в плавании
         if (this.limitSwim >= dist) System.out.println(this.animal + " " + this.name + " проплывает: " + dist + " м.");
         else System.out.println(this.animal + " " + this.name + " не может плывть так далеко");
     }

     public void animalInfo() { // info о характеристиках объекта при создании
         System.out.println(this.animal + " " + this.name + " может пробежать: " + this.limitRun + " м., может проплыть: "
                 + this.limitSwim
                 + " м., может прыгнуть: " + this.limitJump + " m.");
     }
 }

