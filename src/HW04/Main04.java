package HW04;

// за допомогою [] + FOR-EACH

public class Main04 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            System.out.println(num + ") Num is " + num + ", sum is " + sum);
        }

        System.out.println("-----------------------\n" +
                "Sum of numbers is " + sum);
    }
}
