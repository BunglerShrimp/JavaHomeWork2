package homework5;

public abstract class Animal extends Object {
    protected String name;
    protected String color;
    protected int age;
    protected int Run;
    protected double Swim;
    protected double Jump;

    public Animal(String name, String color, int age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void run(int dist) {
        if (this.Run >= dist) System.out.println(this.name + " пробежал/ла " + dist + " метров/а");
        else System.out.println(this.name + " не может так далеко бежать!");
    }

    public void swim(int dist) {
        if (this.Swim >= dist) System.out.println(this.name + " проплыл/ла " + dist + " метров/a");
        else System.out.println(this.name + " не может так далеко плавать!");
    }

    public void jump(double height) {
        if (this.Jump >= height)
            System.out.println(this.name + " прыгнул/ла на " + height + " метров/a");
        else System.out.println( this.name + " не может так высоко прыгать!");
    }

    public void info() { // Если не заданы параметры бега, прыжка или плавания
        System.out.println(this.name + " Может пробежать: " + this.Run + " метров/a, Может проплыть: " + this.Swim + " метров/a, Может прыгнуть на: " + this.Jump + " метров/a");
    }
}



