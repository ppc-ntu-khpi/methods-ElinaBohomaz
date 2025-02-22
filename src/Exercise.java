package domain;

public class Exercise {
    /**
     * @param day День
     * @param month Місяць 
     * @param year Рік 
     * @return Число 
     */
    public static int Calculate(int day, int month, int year) {

        int sum = sumDigits(day) + sumDigits(month) + sumDigits(year);
        while (sum > 9) {
            sum = sumDigits(sum);
        }
        return sum;
    }

    /**
     * @param number Число для обробки
     * @return Сума 
     */
    private static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}