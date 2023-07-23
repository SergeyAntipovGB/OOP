package work.seminar3.task7;

import java.util.Comparator;

public interface Comparator<T> {
    // Сравнивает два объекта типа T и возвращает отрицательное целое число, ноль или положительное целое число,
    // если первый объект меньше, равен или больше второго соответственно.
    int compare(T o1, T o2);

    // Возвращает компаратор, который сортирует объекты в обратном порядке.
    default Comparator<T> reversed() {
        return Collections.reverseOrder(this);
    }

    // Возвращает компаратор, который сначала сравнивает объекты с помощью данного компаратора,
    // а затем по результату сравнения сравнивает их с помощью другого компаратора.
    default <U> Comparator<T> thenComparing(Comparator<? super T> other) {
        Objects.requireNonNull(other);
        return (Comparator<T> & Serializable) (c1, c2) -> {
            int res = compare(c1, c2);
            return (res != 0) ? res : other.compare(c1, c2);
        };
    }

    // Возвращает компаратор, который сначала сравнивает ключи, полученные преобразованием объектов
    // с помощью функции keyExtractor, а затем по результату сравнения ключей сравнивает объекты.
    default <U> Comparator<T> thenComparing(Function<? super T, ? extends U> keyExtractor,
                                            Comparator<? super U> keyComparator) {
        return thenComparing(comparing(keyExtractor, keyComparator));
    }

    // Возвращает компаратор, который сначала сравнивает ключи, полученные преобразованием объектов
    // с помощью функции keyExtractor, а затем по результату сравнения ключей сравнивает объекты.
    default <U extends Comparable<? super U>> Comparator<T> thenComparing(
            Function<? super T, ? extends U> keyExtractor) {
        return thenComparing(comparing(keyExtractor));
    }

    // Возвращает компаратор, который сначала сравнивает результаты применения функции
    // к объектам, а затем по результату сравнения ключей сравнивает объекты.
    static <T, U> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor,
                                          Comparator<? super U> keyComparator) {
        Objects.requireNonNull(keyExtractor);
        Objects.requireNonNull(keyComparator);
        return (Comparator<T> & Serializable) (c1, c2) -> keyComparator.compare(keyExtractor.apply(c1),
                keyExtractor.apply(c2));
    }

    // Возвращает компаратор, который сначала сравнивает результаты применения функции
    // к объектам, а затем по результату сравнения ключей сравнивает объекты.
    static <T, U extends Comparable<? super U>> Comparator<T> comparing(
            Function<? super T, ? extends U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (Comparator<T> & Serializable) (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
    }

    // Возвращает компаратор, который композицией данного компаратора с другим компаратором
    // позволяет выполнить группировку с помощью компаратора.
    default Comparator<T> thenComparingInt(ToIntFunction<? super T> keyExtractor) {
        return thenComparing(comparingInt(keyExtractor));
    }

    // Возвращает компаратор, который композицией данного компаратора с другим компаратором
    // позволяет выполнить группировку с помощью компаратора.
    default Comparator<T> thenComparingLong(ToLongFunction<? super T> keyExtractor) {
        return thenComparing(comparingLong(keyExtractor));
    }

    // Возвращает компаратор, который композицией данного компаратора с другим компаратором
    // позволяет выполнить группировку с помощью компаратора.
    default Comparator<T> thenComparingDouble(ToDoubleFunction<? super T> keyExtractor) {
        return thenComparing(comparingDouble(keyExtractor));
    }

    // Возвращает компаратор, который композицией данного компаратора с другим компаратором
    // позволяет выполнить группировку с помощью компаратора.
    default Comparator<T> thenComparingBoolean(Predicate<? super T> keyExtractor) {
        return thenComparing(comparingBoolean