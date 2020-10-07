package geekbrains.lesson6_homework;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);// наследуюемый признак имени из суперкласса
        this.limitRun = random.nextInt(50) + 150;
        this.limitJump = Math.random() * 1.5 + 0.5;
        this.animal = "Кот";
    }

    @Override
    public void swim(int dist) {
        System.out.println("Котики не любят плавать!");
    }
}
