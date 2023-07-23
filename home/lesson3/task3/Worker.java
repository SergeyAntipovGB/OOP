package home.lesson3.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Worker {
    
    private String name; // имя работника
    private int age; // возраст работника
    private int stage; // стаж работника

    public Worker(String name, int age, int stage) {
        this.name = name;
        this.age = age;
        this.stage = stage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getStage() {
        return stage;
    }

    @Override
    public String toString() {
        return name + " - возраст " +
                age + " лет, стаж работы " +
                stage + " лет";
    }

    public static void main(String[] args) {
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Bill", 35, 10));
        workers.add(new Worker("Chack", 38, 12));
        workers.add(new Worker("Bob", 50, 12));
        workers.add(new Worker("Tony", 27, 8));

        // компаратор для сравнения сначала по стажу работы, затем по возрасту
        Comparator<Worker> ageAndStageComparator = new Comparator<Worker>() {
            @Override
            public int compare(Worker worker1, Worker worker2) {
                int stageCompare = worker2.getStage() - worker1.getStage();
                if (stageCompare != 0) {
                    return stageCompare;
                }
                return worker2.getAge() - worker1.getAge();
            }
        };

        // Сортируем список с помощью компаратора
        workers.sort(ageAndStageComparator);

        // Выводим отсортированный список работников
        System.out.println("Список работников по убыванию опыта работы:");
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
}