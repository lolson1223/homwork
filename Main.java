import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество учеников: ");
        int n = scanner.nextInt();
        int[] grades = new int[n];

        System.out.println("Введите оценки для каждого ученика:");
        for (int i = 0; i < n; i++) {
            System.out.print("Оценка для ученика " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        counter(grades);
    }

    public static void counter(int[] grades) {
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int grade : grades) {
            switch (grade) {
                case 5:
                    gradeA++;
                    break;
                case 4:
                    gradeB++;
                    break;
                case 3:
                    gradeC++;
                    break;
                case 2:
                    gradeD++;
                    break;
                default:
                    System.out.println("Ошибка: Некорректная оценка");
            }
        }

        System.out.println("Количество оценок:");
        System.out.println("A: " + gradeA);
        System.out.println("B: " + gradeB);
        System.out.println("C: " + gradeC);
        System.out.println("D: " + gradeD);
    }


    public class рain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество учеников: ");
            int n = scanner.nextInt();
            int[] grades = new int[n];

            System.out.println("Введите оценки для каждого ученика:");
            for (int i = 0; i < n; i++) {
                System.out.print("Оценка для ученика " + (i + 1) + ": ");
                grades[i] = scanner.nextInt();
            }

            counter(grades);
        }

        public static void counter(int[] grades) {
            int gradeA = 0;
            int gradeB = 0;
            int gradeC = 0;
            int gradeD = 0;

            for (int grade : grades) {
                switch (grade) {
                    case 5:
                        gradeA++;
                        break;
                    case 4:
                        gradeB++;
                        break;
                    case 3:
                        gradeC++;
                        break;
                    case 2:
                        gradeD++;
                        break;
                    default:
                        System.out.println("Ошибка: Некорректная оценка");
                }
            }

            System.out.println("Количество оценок:");
            System.out.println("A: " + gradeA);
            System.out.println("B: " + gradeB);
            System.out.println("C: " + gradeC);
            System.out.println("D: " + gradeD);
        }
    }

}
