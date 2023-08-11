package home.calculator;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    /** Конструктор
     *  объекта View()
     */
    public View() {
        scanner = new Scanner(System.in);
    }

    /** Метод класса View очищает окно вывода в терминале
     */
    public void clearScreen() {
        for (int i = 0; i < 100; i++, System.out.println());
    }

    /** Метод выводит на экран сообщение об ошибке и ожидает
     * от пользователя нажатия клавиши <Enter>
     * @param String alert
     */
    public void displayAlert(String alert) {
        System.out.print(alert);
        scanner.nextLine();
    }

    public void displayResult(String operation, double result) {
        clearScreen();
        System.out.printf("%s = %.2f\n",operation, result);
        scanner.nextLine();
    }

    /** Метод класса View выводит на экран меню программы, запрашивает
     * у пользователя номер пункта меню и возвращает его
     * @return String
     */
    public String getRequest(String request) {
        clearScreen();
        System.out.print(request);
        return scanner.nextLine();
    }

}
