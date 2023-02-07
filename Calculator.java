import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num1, num2;
    char operation;
    System.out.println("Enter first number: ");
    num1 = sc.nextDouble();
    System.out.println("Enter second number: ");
    num2 = sc.nextDouble();
    System.out.println("Enter an operation (+, -, *, /): ");
    operation = sc.next().charAt(0);
    sc.close();
    double result;
    switch (operation) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
      default:
        System.out.println("Invalid operator");
        return;
    }
    System.out.println("Result: " + result);
  }
}
