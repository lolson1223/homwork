public class fd {
    public void checkNumberSign(int number) {
        if (number > 0) {
            System.out.println("Положительное число");
        } else if (number < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Ноль");
        }
    }
    public void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }
    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public String getGrade(int score) {
        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80 && score <= 89) {
            return "B";
        } else if (score >= 70 && score <= 79) {
            return "C";
        } else if (score >= 60 && score <= 69) {
            return "D";
        } else {
            return "F";
        }
    }
    public String getSeason(String month) {
        if (month.equalsIgnoreCase("январь") || month.equalsIgnoreCase("февраль") || month.equalsIgnoreCase("декабрь")) {
            return "Зима";
        } else if (month.equalsIgnoreCase("март") || month.equalsIgnoreCase("апрель") || month.equalsIgnoreCase("май")) {
            return "Весна";
        } else if (month.equalsIgnoreCase("июнь") || month.equalsIgnoreCase("июль") || month.equalsIgnoreCase("август")) {
            return "Лето";
        } else if (month.equalsIgnoreCase("сентябрь") || month.equalsIgnoreCase("октябрь") || month.equalsIgnoreCase("ноябрь")) {
            return "Осень";
        } else {
            return "Некорректный месяц";
        }
    }
    public String getTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "Равносторонний";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Равнобедренный";
        } else {
            return "Разносторонний";
        }
    }
    public String checkDivisibility(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Кратно 3 и 5";
        } else if (number % 3 == 0) {
            return "Кратно 3";
        } else if (number % 5 == 0) {
            return "Кратно 5";
        } else {
            return "Не кратно ни 3, ни 5";
        }
    }

}
