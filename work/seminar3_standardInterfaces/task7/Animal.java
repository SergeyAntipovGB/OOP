package work.seminar3_standardInterfaces.task7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Animal {
    
    private String name;
    private int age;
    private int height; // Новое поле для роста животного

    public Animal(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Cat", 5, 30));
        animals.add(new Animal("Dog", 3, 40));
        animals.add(new Animal("Elephant", 10, 200));
        animals.add(new Animal("Lion", 7, 90));

        // Создаем компаратор для сравнения сначала по возрасту, затем по росту
        Comparator<Animal> ageAndHeightComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                // Сравниваем по возрасту
                int ageCompare = animal1.getAge() - animal2.getAge();
                if (ageCompare != 0) {
                    return ageCompare;
                }
                // При равенстве возраста сравниваем по росту
                return animal1.getHeight() - animal2.getHeight();
            }
        };

        // Сортируем список животных с помощью компаратора
        animals.sort(ageAndHeightComparator);

        // Выводим отсортированный список животных
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}