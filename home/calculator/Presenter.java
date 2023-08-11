package home.calculator;

import java.util.ArrayList;
import java.util.List;

/** Класс является связующим звеном между
 * функциональным классом Model и презентативным
 * классом View. Управляет логикой взаимосвязей
 * между классами и обменом данными.
 */
public class Presenter implements Phrases {
    private Model calculate;
    private View view;

    /** Объект класса Exit - флаг для завершения программы.
     * При инициализации получает значение false. 
     * Если значение меняется на true - программа завершается.
     */
    Exit exit = new Exit();

    /** Конструктор класса Presenter
     * @param model
     * @param view
     */
    public Presenter(Model model, View view) {
        this.calculate = model;
        this.view = view;
    }

    /** Метод класса Presenter запрашивает действие и обрабатывает
     * результат
     */
    public void requestExpression() {
        String expression = view.getRequest(REQUEST_EXPRESSION);
        if (isInteger(expression)) {
            int numberOfExpression = Integer.parseInt(expression);
            if (numberOfExpression > 0 & numberOfExpression < 5) {
                performeExpression(numberOfExpression);
            }else
                view.displayAlert(ALERT_ILLEGAL_NUMBER);
        }else
            view.displayAlert(ALERT_NOT_NUMBER);
        if (!exit.isExit()) requestExpression();
    }
    
    /** Метод класса Presenter запрашивает арифметическое выражение
     * и обрабатывает результат
     */
    public void requestOperation() {
        String operation = view.getRequest(REQUEST_OPERATION);
        /* парсит выражение на два списка данных */
        List<String> listNumbers = getNumbers(operation);
        List<String> listSymbols = getSymbols(operation);
        /* проверка корректности данных */
        if (listNumbers.size() - listSymbols.size() != 1 ||
            listSymbols.size() < 1) {
                view.displayAlert(ALERT_LOOSE_OPERAND);
                requestExpression();
            }
        for (String string : listNumbers) {
            if (!isDouble(string)) {
                view.displayAlert(ALERT_NOT_NUMBER);
                requestExpression();
            }
        }
        /* отправляет списки на вычисление */
        calculate = new Model(listNumbers, listSymbols);
        if (calculate.count()) {
            view.displayAlert(ALERT_DIV_BY_ZERO);
        }else
            view.displayResult(operation, calculate.getResult());
    }

    /** Метод парсит полученное выражение и возвращает
     * список чисел для вычислений
     * @param String s
     * @return List<String> list
     */
    private static List<String> getNumbers(String s) {
        /* устраняет лишние пробелы */
        String[] arrNoSpaces = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : arrNoSpaces) {
            stringBuilder.append(string);
        }
        /* формирование списка чисел */
        List<String> list = new ArrayList<String>();
        String[] array = stringBuilder.toString().split("[^.^\\w]");
        for (String str: array) {
            list.add(str);
        }
        return list;
    }
    
    /** Метод парсит полученное выражение и возвращает
     * список математических операций для вычислений
     * @param String s
     * @return List<String> list
     */
    private static List<String> getSymbols(String s) {
        List<String> list = new ArrayList<String>();
        String[] sArr = s.split("");
        for (String i : sArr) {
            if (i.equals("+") || i.equals("*") || i.equals("-") || i.equals("/")) {
                list.add(i);
            }
        }
        return list;
    }

    /** Метод проверяет строку на возможность преобразования
     * в целое число
     * @param String string
     * @return Boolean
     */
    private boolean isInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /** Метод проверяет соответствие строчных данных
     * типу double
     * @param string
     * @return boolean
     */
    private boolean isDouble(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /** Метод обработки меню
     * @param position
     */
    public void performeExpression(int position) {
        switch (position) {
            case 1:
                view.clearScreen();
                view.displayAlert(HELP);
                break;
            case 2:
                requestOperation();
                break;
            case 3:
                view.clearScreen();
                view.displayAlert(LOG);
                break;
            case 4:
                view.clearScreen();
                view.displayAlert(END);
                view.clearScreen();
                exit.onExit();
                break;
        }
    }

}
