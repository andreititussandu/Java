package ArrayChallenges;

import java.util.Scanner;

public class MinAndMaxChallenge {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int min = 2147483647, max = 0;//Integer.MAX_VALUE pt min;
        while (true){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();

                if (number > max)
                    max = number;

                if (number < min)
                    min = number;
            }
            else break;
            scanner.nextLine();
        }
        System.out.println("min= " + min + "; max= " + max);
    }
}