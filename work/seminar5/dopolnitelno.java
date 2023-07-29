package work.seminar5;

import java.util.Arrays;
import java.util.List;

public class dopolnitelno {
    
}




//?????????????????????????/
public class Test <T extends Number>{
    T a, b;

    public Test(T a, T b) {
        this.a = a;
        this.b = b;
    }

   public T add(){
       return a + b; // Operator '+' cannot be applied to 'T', 'T'
   }
}

// 11:18
// вот такое дело как решить?




//§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
public T add() {
    if (a instanceof Double || b instanceof Double) {
        return (T) (Double) (a.doubleValue() + b.doubleValue());
    } else if (a instanceof Float || b instanceof Float) {
        return (T) (Float) (a.floatValue() + b.floatValue());
    } else if (a instanceof Long || b instanceof Long) {
        return (T) (Long) (a.longValue() + b.longValue());
    } else {
        return (T) (Integer) (a.intValue() + b.intValue());
    }
}


//§§§§§§§§§§§§§§§§§§§§§§§§§§§§§
public class DataObject {
    private int value1;
    private double value2;
    private String value3;

    // Конструктор и геттеры/сеттеры
}

public class MyClass {
    private DataObject data;

    public MyClass(DataObject data) {
        this.data = data;
    }
}


//§§§§§§§§§§§§§§§§§§§§§§§§§§§
public class MyClass {
    private int value1;
    private double value2;
    private String value3;
    // ... много других параметров

    public MyClass(Builder builder) {
        this.value1 = builder.value1;
        this.value2 = builder.value2;
        this.value3 = builder.value3;
        // ... установка других параметров
    }

    public static class Builder {
        private int value1;
        private double value2;
        private String value3;
        // ... другие параметры с дефолтными значениями

        public Builder(int value1, double value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public Builder value3(String value3) {
            this.value3 = value3;
            return this;
        }

        // ... методы для установки других параметров

        public MyClass build() {
            return new MyClass(this);
        }
    }
}

// Использование Builder для создания объекта MyClass
MyClass myObject = new MyClass.Builder(10, 3.14)
                        .value3("Hello")
                        // ... установка других параметров
                        .build();

//§§§§§§§§§§§§§§§§§§§§§§§§§§§
public class MyClass {
    private List<Integer> values;

    public MyClass(List<Integer> values) {
        this.values = values;
    }
}

// Создание объекта MyClass с помощью списка значений
List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
MyClass myObject = new MyClass(data);