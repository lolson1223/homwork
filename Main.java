public class Main {
    public static void main(String[] args) {
        // Создание переменных всех 8 примитивных типов данных
        int variable1 = 10;                 // Целочисленный тип данных
        double variable2 = 3.14;            // Вещественный тип данных
        boolean variable3 = true;           // Логический тип данных
        char variable4 = '\\';              // Символьный тип данных
        byte variable5 = 127;               // Тип данных "байт"
        short variable6 = 32767;            // Тип данных "short"
        long variable7 = 1234567890L;       // Тип данных "long"
        float variable8 = 2.5f;             // Тип данных "float"

        // Вывод значений переменных
        System.out.println("/'\"работу выполнил/ yauheni\"'\\");
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(variable6);
        System.out.println(variable7);
        System.out.println(variable8);

        // Вывод пустой строки
        System.out.println();

        // Изменение значений переменных
        variable1 = 20;
        variable2 = 6.28;
        variable3 = false;
        variable4 = '"';
        variable5 = -128;
        variable6 = -32768;
        variable7 = 9876543210L;
        variable8 = 4.2f;

        // Вывод измененных значений переменных
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(variable6);
        System.out.println(variable7);
        System.out.println(variable8);
    }
}
