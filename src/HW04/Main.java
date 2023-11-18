package HW04;

public class Main {

    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while (num <= 6) {
            sum += num;
            System.out.println(num + ") Num is " + num + ", sum is " + sum);
            num += 1;
        }

        System.out.println("\n-----------------------\n" + "Sum of numbers is " + sum);
    }
}
