package homework5;

public class main {
    public static void main(String[] args) {
        Dog d = new Dog("Шарик", "черный",2);
        Horse h  = new Horse("Буцефал", "рыжий",7);
        Cat c = new Cat("Леопольд", "белый",4);
        Bird b = new Bird("Кар-карыч", "радужный",3);

        d.info();
        h.info();
        c.info();
        b.info();
        System.out.println();

        d.run(236);
        h.run(1590);
        c.run(5);
        b.run(4);
        System.out.println();

        d.swim(13);
        h.swim(123);
        c.swim(11);
        b.swim(33);
        System.out.println();

        d.jump(3);
        h.jump(1);
        c.jump(3);
        b.jump(1);
        System.out.println();




    }
}
