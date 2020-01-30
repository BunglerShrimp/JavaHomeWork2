package homework5;

public class Bird extends Animal {
    public Bird(String name, String color, int age) {
        super(name, color, age);
        this.Run = 5;
        this.Jump = 0.2;
    }
    @Override
    public void swim(int dist) {
        System.out.println(name + " не умеет плавать!");
    }
}
