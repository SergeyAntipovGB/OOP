package work.seminar6.taskI;

interface Fetchable {
    void fetch();
}

interface Scratchable {
    void scratch();
}

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal { // Интерфейс Fetchible не используется и поэтому не имплементируется
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
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

public class MainTrue {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Вывод: Dog barks.
        animal2.makeSound(); // Вывод: Cat meows.
    
        if (animal2 instanceof Scratchable) {
            Scratchable cat = (Scratchable) animal2;
            cat.scratch(); // Вывод: Cat scratches.
        }
    }
}
