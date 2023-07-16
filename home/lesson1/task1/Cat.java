package home.lesson1.task1;

public class Cat {
    private String name;
    private int age;
    private String ownerName;


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        Owner owner = new Owner(ownerName);
        this.ownerName = owner.getName();
    }

    public Cat() {
        this.name = "";
        this.age = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    // public void greet() {
    //     System.out.printf("\nМяу! Меня зовут %s. Мне %d года(лет).\n\n", name, age);
    // }
    
    public void greet() {
        System.out.printf("\nМяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n\n", name, age, ownerName);
    }
}