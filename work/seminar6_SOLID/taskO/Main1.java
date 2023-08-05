package work.seminar6_SOLID.taskO;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    private String name;
    
    public Cat(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Bird implements Animal {
    private String name;
    
    public Bird(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}

class AnimalSoundManager {
    public void playAnimalSound(Animal animal) {
        animal.makeSound();
    }
}

public class Main1 {
    public static void main(String[] args) {
        AnimalSoundManager soundManager = new AnimalSoundManager();
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Animal bird = new Bird("Polly");
        
        soundManager.playAnimalSound(dog); // Вывод: Woof!
        soundManager.playAnimalSound(cat); // Вывод: Meow!
        soundManager.playAnimalSound(bird); // Вывод: Chirp!
    }
}
