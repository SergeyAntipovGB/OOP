package work.seminar6.taskS;

public class Animal {
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void move() {
        // Код для перемещения животного
    }
    
    public void makeSound() {
        // Код для издания звука
    }
}    

class AnimalActions {
    
    public void eat() {
        // Код для питания животного
    }
    
    public void sleep() {
        // Код для сна животного
    }
    
    public void reproduce() {
        // Код для размножения животного
    }
}
