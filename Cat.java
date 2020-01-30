package homework5;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.Run = 200;
        this.Jump = 2;
        }
    @Override
    public void swim(int dist) {
        System.out.println(name + " не умеет плавать!");
    }
    }
