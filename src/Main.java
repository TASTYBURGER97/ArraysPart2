import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ////////Task1 /////////
        int[] array = arrayRandom (30);
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Сумма траты за месяц составила: " + sum);


        ////////Task2 /////////

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение = " + min + "Максимальное значние = " + max);

        Arrays.sort(array);
        System.out.printf("Минимальный расход в течении месяца = %d, максимальный расход = %d \n", array[0], array[array.length-1]);

        System.out.printf("Средний расход за месяц составил: %.2f \n", (double)sum/ array.length);

        ////////Task3 /////////
        String string = "Иван Иванович Иванов";
        char[] stringToChar = string.toCharArray();
        System.out.println(Arrays.toString(stringToChar));
        for(int i = stringToChar.length - 1; i>=0; i--) {
            System.out.println(stringToChar[i]);

        }



    }

    public static int[] arrayRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }

}








