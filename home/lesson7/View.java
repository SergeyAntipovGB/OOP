package home.lesson7;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void displayResult(double result) {
        System.out.printf("\nРезультат: %.2f\n", result);
    }

    public String getOperation() {
        System.out.print("\nВведите опeрацию (+,-,*,/) > ");
        return scanner.nextLine();
    }
    public double getOperand(){
        System.out.print("\nВведите число > ");
        return Double.parseDouble(scanner.nextLine());
    }
}
