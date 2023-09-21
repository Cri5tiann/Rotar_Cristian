package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for(int number = 0; number != 100; number++){
            numbers[number] = 100 - number;
        }
        for(int number = 0; number != 100; number++) {
            System.out.println(numbers[number]);
        }


        int sum = 0;
        long multiplication = 1;


        for(int number = 0; number != numbers.length; number++) {
        if (number % 2 == 0) {
            sum += number; }
        else {
            multiplication *= number; }
        }

        System.out.println("the sum of even numbers is: " + sum);
        System.out.println("the multiplication of odd numbers is: " + multiplication);


        int[] copyNumbers = new int[100];

        for(int number = 0; number != numbers.length; number++){
            copyNumbers[number] = numbers[number];
        }

    }

}
