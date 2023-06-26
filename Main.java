import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задача 1
        System.out.println("Введите первое слово:");
        String word1 = scanner.next();

        System.out.println("Введите второе слово:");
        String word2 = scanner.next();

        String newWord = returnNewWord(word1, word2);
        System.out.println("Новое слово: " + newWord);

        // Задача 2
        System.out.println("Введите первое число:");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число:");
        int num2 = scanner.nextInt();

        performArithmeticOperations(num1, num2);

        // Задача 3
        System.out.println("Введите сумму в евро:");
        double euroAmount = scanner.nextDouble();

        System.out.println("Введите текущий курс (количество долларов за 1 евро):");
        double exchangeRate = scanner.nextDouble();

        convertToUSD(euroAmount, exchangeRate);

        // Дополнительные задачи

        // Задача 4
        int smallPizzaDiameter = 24;
        int largePizzaDiameter = 28;
        int caloriesPerSquareCm = 40;

        int additionalCalories = calorieCalculator(smallPizzaDiameter, largePizzaDiameter, caloriesPerSquareCm);
        System.out.println("Дополнительные калории: " + additionalCalories);

        // Задача 5
        double triangleArea = calculateTriangleArea(5, 7, 8);
        System.out.println("Площадь треугольника: " + triangleArea);

        double rectangleArea = calculateRectangleArea(4, 6);
        System.out.println("Площадь прямоугольника: " + rectangleArea);

        double circleArea = calculateCircleArea(3);
        System.out.println("Площадь круга: " + circleArea);

        // Задача 6
        String str1 = "hello";
        String result1 = getChars(str1, 0, 4);
        System.out.println(result1); // Output: "ho"

        String str2 = "java";
        String result2 = getChars(str2, 1, 3);
        System.out.println(result2); // Output: "aa"

        String str3 = "method";
        String result3 = getChars(str3, 5, 1);
        System.out.println(result3); // Output: "de"
    }

    public static String returnNewWord(String word1, String word2) {
        int halfLength1 = word1.length() / 2;
        int halfLength2 = word2.length() / 2;

        String firstHalf = word1.substring(0, halfLength1);
        String secondHalf = word2.substring(halfLength2);

        return firstHalf + secondHalf;
    }

    public static void performArithmeticOperations(int num1, int num2) {
        int sumResult = sum(num1, num2);
        int subtractResult = subtract(num1, num2);
        int multiplyResult = multiply(num1, num2);
        int divideResult = divide(num1, num2);

        System.out.println("Сумма: " + sumResult);
        System.out.println("Вычитание: " + subtractResult);
        System.out.println("Умножение: " + multiplyResult);
        System.out.println("Деление: " + divideResult);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void convertToUSD(double euroAmount, double exchangeRate) {
        double usdAmount = euroAmount * exchangeRate;
        System.out.println("при курсе " + exchangeRate + " USD за один EUR, при обмене " + euroAmount + " EUR, вы получите " + usdAmount + " USD.");
    }

    public static int calorieCalculator(int smallDiameter, int largeDiameter, int caloriesPerSquareCm) {
        int smallRadius = smallDiameter / 2;
        int largeRadius = largeDiameter / 2;

        double smallArea = Math.PI * smallRadius * smallRadius;
        double largeArea = Math.PI * largeRadius * largeRadius;

        int additionalCalories = (int) ((largeArea - smallArea) * caloriesPerSquareCm);
        return additionalCalories;
    }

    public static double calculateTriangleArea(double side1, double side2, double side3) {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        return area;
    }

    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static double calculateCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static String getChars(String str, int index1, int index2) {
        char char1 = str.charAt(index1);
        char char2 = str.charAt(index2);

        return String.valueOf(char1) + char2;
    }
}
