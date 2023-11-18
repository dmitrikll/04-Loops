package HW04;

// за допомогою [] + FOR

public class Main01 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int i = 0; i < numbers.length; i += 1) {
            sum += numbers[i];
            System.out.println(numbers[i] + ") Num is " + numbers[i] + ", sum is " + sum);
        }

        System.out.println("\n-----------------------\n\n" +
                "Sum of numbers is " + sum);
    }
}
