public class Main {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;
        System.out.println("Могу ли я пойти гулять? " + canWalk);

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen || isReweOpen;
        System.out.println("Могу ли я купить еду? " + canBuy);

        int temperature1 = 105;
        int temperature2 = 95;
        boolean deviceWorking = checkDevice(temperature1, temperature2);
        System.out.println("Устройство работает? " + deviceWorking);

        int remainingSeconds = 9000; // Пример значения, можно использовать случайное число в диапазоне от 0 до 28800
        displayRemainingHours(remainingSeconds);
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }

    public static void displayRemainingHours(int remainingSeconds) {
        int remainingHours = remainingSeconds / 3600;
        System.out.println("Осталось " + remainingHours + " час/а/ов");
    }
}
