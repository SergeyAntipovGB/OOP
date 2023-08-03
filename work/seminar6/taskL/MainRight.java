package work.seminar6.taskL;

interface Fetchable {
    void fetch();
}

interface Scratchable {
    void scratch();
}

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal implements Fetchable {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void fetch() {
        System.out.println("Dog fetches.");
    }
}

class Cat extends Animal implements Scratchable {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }

    @Override
    public void scratch() {
        System.out.println("Cat scratches.");
    }
}

public class MainRight {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Вывод: Dog barks.
        animal2.makeSound(); // Вывод: Cat meows.

        if (animal1 instanceof Fetchable) {
            Fetchable dog = (Fetchable) animal1;
            dog.fetch(); // Вывод: Dog fetches.
        }

        if (animal2 instanceof Scratchable) {
            Scratchable cat = (Scratchable) animal2;
            cat.scratch(); // Вывод: Cat scratches.
        }
    }
}
