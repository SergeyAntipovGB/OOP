package work.seminar1_PrinciplesOOP;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound(); // Вывод: "The dog barks"
        animal2.makeSound(); // Вывод: "The cat meows"
    }
}
// В этом примере есть базовый класс Animal и два его подкласса Dog и Cat. У каждого класса есть метод makeSound(), который выводит звук, издаваемый животным.

// В методе main() создаются объекты типа Dog и Cat, но переменные, которые их хранят, имеют тип Animal. Затем вызывается метод makeSound() для каждого объекта. Важно отметить, что метод makeSound() будет вызывать соответствующую реализацию для каждого объекта в зависимости от их фактического типа.

// Таким образом, благодаря полиморфизму, мы можем обращаться к объектам разных подклассов через общий интерфейс базового класса, что позволяет нам писать более гибкий и расширяемый код.