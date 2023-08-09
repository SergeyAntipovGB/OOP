package work.seminar7_patterns.prototype;
// Неглубокое клонирование

class Address {
    private String city;
    private String street;
    
    public void setCity(String city) {
        this.city = city;
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    // Конструктор копирования для не глубокого клонирования
    public Address(Address other) {
        this.city = other.city;
        this.street = other.street;
    }

    // @Override
    // public String toString() {
    //     return "city: " + city + ", street: " + street;
    // }
}

class Person {
    private String name;
    private int age;
    private Address address;
    
    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }    
    
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Конструктор копирования для не глубокого клонирования
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        // Производим клонирование Address с помощью конструктора копирования
        this.address = new Address(other.address);
    }

    // Метод копирования
    public Person copy() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "Person: " + name + ", age: " + age + ", address: " + address;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Address address = new Address("CityA", "StreetA");
        Person person1 = new Person("Alice", 30, address);

        // Копируем объект person1
        Person person2 = person1.copy();
        // Person person2 = person1;

        // Изменяем поле в скопированном объекте
        // person2.setName("Bob");
        // person2.getAddress().setCity("CityB");

        // Выводим информацию об объектах
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
    }
}
