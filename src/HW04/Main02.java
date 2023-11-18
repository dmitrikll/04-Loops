package HW04;

// за допомогою FOR

public class Main02 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 6; i += 1) {
            sum += i;
            System.out.println(i + ") Num is " + i + ", sum is " + sum);
        }

        System.out.println("-----------------------\n" +
                "Sum of numbers is " + sum);
    }
}
