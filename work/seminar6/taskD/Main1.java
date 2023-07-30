package work.seminar6.taskD;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class PetOwner {
    private Animal animal;

    public PetOwner(Animal animal) {
        this.animal = animal;
    }

    public void makeAnimalSound() {
        animal.makeSound();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        PetOwner petOwner = new PetOwner(dog);

        petOwner.makeAnimalSound(); // Вывод: Dog barks.
    }
}
