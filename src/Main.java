public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] paymentsInMonth = {163365, 21346, 34634, 43164, 5234};
        int allPayments = 0;
        for (int payment : paymentsInMonth) {
            allPayments += payment;
        }
        System.out.println("Сумма трат за месяц составила " + allPayments + " рублей");

        System.out.println("\nЗадание 2");
        int [] paymentsInWeek = {12354, 213, 2345, 3146, 34567};
        int maxValue = 0;
        int minValue = Integer.MAX_VALUE;
        for (int payment : paymentsInWeek) {
            if (payment > maxValue) {
                maxValue = payment;
            }
            if (payment < minValue) {
                minValue = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minValue + " рублей. Максимальная сумма трат за неделю составила " + maxValue + " рублей");

        System.out.println("\nЗадание 3");
        int[] paymentsPerWeek = {2364, 1462, 3457, 247824, 24634};
        int sum = 0;
        for (int payment : paymentsPerWeek) {
            sum += payment;
        }
        double average = (double) sum / paymentsPerWeek.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("\nЗадание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length - 1;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[length];
            reverseFullName[length--] = temp;
        }
        System.out.println(new String(reverseFullName));
    }
}